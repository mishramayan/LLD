public class Directories {

    private String dirName;
    private String parentDir;

    public Directories(String dirName, String parentDir){
        this.dirName = dirName;
        this.parentDir = parentDir;
    }

    public String getDirName(){
        return this.dirName;
    }

    public String getDirParent(){
        return this.parentDir;
    }

}
