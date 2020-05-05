import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Address firstAddress = new Address("21645, Donetsk, Sadoviy, 31, 6");
        TransliteratedAddress secondTransliteratedAddress = new TransliteratedAddress("35645, Киев, Хрещатик, 25, 3");

        FileOutputStream fos = new FileOutputStream("address.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(firstAddress);
        oos.writeObject(secondTransliteratedAddress);

        oos.close();
    }
}
