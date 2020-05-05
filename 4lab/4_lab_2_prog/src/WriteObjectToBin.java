import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjectToBin {
    public static void main(String[] args) throws IOException {
        ArrayList<Address> addresses = ReadObjectFromCSV.readCSV();

        FileOutputStream fos = new FileOutputStream("address.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(addresses);

        oos.close();
    }
}
