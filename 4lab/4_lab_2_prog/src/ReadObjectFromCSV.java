import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadObjectFromCSV {
    public static ArrayList<Address> readCSV() throws IOException {
        FileInputStream fis = new FileInputStream("address.csv");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(isr);

        String line;
        String[] cols;

        ArrayList<Address> addresses = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            cols = line.replaceAll("\"", "").split(",", 2);
            if (cols[0].equals("Address")) {
                addresses.add(new Address(cols[1]));
            }
            else if (cols[0].equals("TransliteratedAddress")) {
                addresses.add(new TransliteratedAddress(cols[1]));
            }
        }
        reader.close();
        return addresses;
    }
}
