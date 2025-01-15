import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileFinderImpl implements FileFinder{

    private Map<String, List<String>> directoriesMap = new HashMap<>();
    private Map<String, String> filesMap = new HashMap<>();
    List<File> listFiles = new ArrayList<>();

    @Override
    public void addDirectories(List<Directories> listDir) {
        for(Directories dir : listDir){
            if(!directoriesMap.containsKey(dir.getDirParent())){
                directoriesMap.put(dir.getDirParent(), new ArrayList<>());
            }
            directoriesMap.get(dir.getDirParent()).add(dir.getDirName());
        }
    }

    @Override
    public void createFiles(List<File> listFile) {
        for(File file : listFile){
            listFiles.add(file);
            filesMap.put(file.getFileName(), file.getFileDirName());
        }
    }

    @Override
    public String findFile(String root, String ext, int size) {
        List<String> result = new ArrayList<>();
        findFilesRecursive(root, ext, size, result);
        return result.toString();
    }

    private void findFilesRecursive(String currentDir, String ext, int size, List<String> result) {
        // Filter files in the current directory
        for (Map.Entry<String, String> fileEntry : filesMap.entrySet()) {
            if (fileEntry.getValue().equals(currentDir)) {
                String fileName = fileEntry.getKey();
                File file = getFileByName(fileName);
                if (file.getFileExt().equals(ext) && parseSize(file.getFileSize()) >= size) {
                    result.add(currentDir + "/" + fileName);
                }
            }
        }

        // Recursively search in subdirectories
        if (directoriesMap.containsKey(currentDir)) {
            for (String subDir : directoriesMap.get(currentDir)) {
                findFilesRecursive(subDir, ext, size, result);
            }
        }
    }

    private int parseSize(String fileSize) {
        return Integer.parseInt(fileSize.split(" ")[0]);
    }

    private File getFileByName(String fileName) {
        for(File file : listFiles){
            if(file.getFileName().equals(fileName)){
                return file;
            }
        }
        return null;
    }

}
