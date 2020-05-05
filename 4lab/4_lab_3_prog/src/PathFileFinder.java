import java.io.*;

public class PathFileFinder {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Andrew\\Desktop\\Java\\4lab\\4_lab_3_prog");
        System.out.println("Searched number of files in directories: " + search(f));
    }

    private static int search(File topDirectory) throws IOException {
        int fileNumber = 0;
        File[] list = topDirectory.listFiles();
        assert list != null;
        for (File file : list) {
            if (file.isDirectory()) {
                fileNumber += search(file);
            } else {
                System.out.println(file);
                fileNumber++;
                savePathIntoTxt(file);
            }
        }
        return fileNumber;
    }

    public static void savePathIntoTxt(File path) throws IOException {
        FileWriter fw = new FileWriter("filePaths.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println(path);
        pw.flush();
        pw.close();
    }
}
