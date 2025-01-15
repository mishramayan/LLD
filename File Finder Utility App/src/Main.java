import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define directories
        List<Directories> listDir = new ArrayList<>();
        listDir.add(new Directories("root", null));
        listDir.add(new Directories("dir123", "root"));
        listDir.add(new Directories("dir456", "root"));

        // Define files
        List<File> listFile = new ArrayList<>();
        listFile.add(new File("abc", ".txt", "500 bytes", "root"));
        listFile.add(new File("mnc", ".csv", "1000 bytes", "root"));
        listFile.add(new File("pqr", ".txt", "300 bytes", "dir123"));
        listFile.add(new File("qwe", ".log", "1500 bytes", "root"));

        // Create and initialize FileFinder implementation
        FileFinder fileFinder = new FileFinderImpl();
        fileFinder.addDirectories(listDir);
        fileFinder.createFiles(listFile);

        // Find and print files matching criteria
        String result = fileFinder.findFile("root", ".txt", 300);
        System.out.println("Matching files: " + result);
    }
}
