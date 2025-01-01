import java.util.HashSet;
import java.util.Set;

public class Package {
    String name;
    boolean isExplicitlyInstalled = false;
    Set<Package> dependencies = new HashSet<>();
    Set<Package> dependents = new HashSet<>();

    public Package(String name){
        this.name = name;
    }
}
