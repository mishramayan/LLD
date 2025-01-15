import java.util.List;

public interface FileFinder {

    public void addDirectories(List<Directories> listDir);
    public void createFiles(List<File> listFile);
    public String findFile(String root, String ext, int size);

}
