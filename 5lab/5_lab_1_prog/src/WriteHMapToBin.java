import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class WriteHMapToBin {
    public WriteHMapToBin(HashMap<String, String> HMap) throws IOException {

        FileOutputStream fos = new FileOutputStream("userPassHMap.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(HMap);

        oos.close();
        fos.close();
    }

}