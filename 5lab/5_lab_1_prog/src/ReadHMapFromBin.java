import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class ReadHMapFromBin {
    public static HashMap<String, String> getHMap() throws ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("userPassHMap.bin");
            ois = new ObjectInputStream(fis);
            HashMap<String, String> HMap = (HashMap) ois.readObject();
            ois.close();
            fis.close();
            return HMap;
        } catch (IOException e) {
            System.out.println("File is empty!");
            return new HashMap<String, String>();
        }
    }
}
