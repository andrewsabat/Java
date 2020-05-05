import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjectFromBin {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("address.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Address> addresses = (ArrayList<Address>) ois.readObject();

        for (Address address: addresses) {
            System.out.println(address);
        }

        ois.close();
    }
}
