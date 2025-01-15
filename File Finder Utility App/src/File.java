public class File {

    private String fileName;
    private String fileExt;
    private String fileSize;
    private String dirName;

    public File(String fileName, String fileExt, String fileSize, String dirName){
        this.fileName = fileName;
        this.fileExt = fileExt;
        this.fileSize = fileSize;
        this.dirName = dirName;
    }

    public String getFileName(){
        return this.fileName;
    }

    public String getFileExt(){
        return this.fileExt;
    }

    public String getFileDirName(){
        return dirName;
    }

    public String getFileSize() {
        return fileSize;
    }
}
