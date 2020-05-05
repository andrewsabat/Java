import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("address.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Address firstAddress = (Address) ois.readObject();
        Address secondTransliteratedAddress = (TransliteratedAddress) ois.readObject();

        System.out.println(firstAddress);
        System.out.println(secondTransliteratedAddress);

        ois.close();
    }
}
