import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.HashMap;

public class LoginForm extends JFrame {
    private boolean isRegister = false;
    private JButton jbLogin;
    private JButton jbExit;
    private JButton jbReg;
    private JPanel panelMain;
    private JTextField jtfLogin;
    private JPasswordField jpfPass;
    private JPasswordField jpfConfPass;
    private JLabel jlConfPass;

    public LoginForm() throws ClassNotFoundException {
        setBounds(600, 300, 300, 170);
        setResizable(false);
        setTitle("Login");
        setContentPane(panelMain);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        jpfConfPass.setVisible(false);
        jlConfPass.setVisible(false);
        HashMap<String, String> userPassHMap = ReadHMapFromBin.getHMap();
        System.out.println(userPassHMap);

        jbLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtfLogin.getText().trim().isEmpty() &&
                        !jpfPass.getText().trim().isEmpty() &&
                        userPassHMap.containsKey(jtfLogin.getText().trim()) &&
                        userPassHMap.get(jtfLogin.getText().trim()).equals(jpfPass.getText().trim())
                ) {
                    JOptionPane.showMessageDialog(panelMain,
                            "Logged in!");
                } else {
                    JOptionPane.showMessageDialog(panelMain,
                            "Incorrectly entered data!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        jbReg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isRegister) {
                    jpfConfPass.setVisible(true);
                    jlConfPass.setVisible(true);
                    jbLogin.setVisible(false);
                    LoginForm.super.setBounds(600, 300, 300, 220);
                    LoginForm.super.setTitle("Register");
                    isRegister = true;
                } else {
                    if (!jtfLogin.getText().trim().isEmpty() &&
                            !jpfPass.getText().trim().isEmpty() &&
                            !jpfConfPass.getText().trim().isEmpty() &&
                            jpfPass.getText().trim().equals(jpfConfPass.getText().trim())
                    ) {
                        userPassHMap.put(jtfLogin.getText().trim(), jpfPass.getText().trim());
                        System.out.println(userPassHMap);
                    }
                }
            }
        });

        jbExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(panelMain,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        new WriteHMapToBin(userPassHMap);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(panelMain,
                        "Are you sure you want to close this window?", "Close Window?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    try {
                        new WriteHMapToBin(userPassHMap);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });

    }

}
