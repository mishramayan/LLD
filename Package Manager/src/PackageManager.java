import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PackageManager {
    private final Map<String, Package> packageMap = new HashMap<>();

    public void install(String packageName, boolean explicit){
        Package pkg = packageMap.get(packageName);
        if(pkg == null){
            throw new IllegalArgumentException("Package not found " + packageName);
        }
        installPackage(pkg, explicit);
    }

    public void installPackage(Package pkg, boolean explicit) {
        if(pkg.isExplicitlyInstalled){
            System.out.println("Package already installed : " + pkg.name);
            return;
        }

        for(Package dependency : pkg.dependencies){
            installPackage(dependency, false);
        }

        pkg.isExplicitlyInstalled = explicit;
        System.out.println("Package installed : " + pkg.name);
    }

    public void uninstallPackage(String packageName){
        Package pkg = packageMap.get(packageName);
        if(pkg == null || !pkg.isExplicitlyInstalled){
            System.out.println("Cannot uninstall package : " + packageName);
            return;
        }

        for (Package dependent : pkg.dependents) {
            if (dependent.isExplicitlyInstalled) {
                System.out.println("Cannot uninstall " + packageName + " because it is required by " + dependent.name);
                return;
            }
        }

        pkg.isExplicitlyInstalled = false;
        for (Package dependency : pkg.dependencies) {
            uninstallPackage(dependency.name);
        }

        System.out.println("Uninstalled: " + packageName);
    }

    public Set<String> getConsumedPackages(String packageName) {
        Package pkg = packageMap.get(packageName);
        if (pkg == null) return Collections.emptySet();
        return pkg.dependencies.stream().map(p -> p.name).collect(Collectors.toSet());
    }

    public Set<String> getConsumingPackages(String packageName) {
        Package pkg = packageMap.get(packageName);
        if (pkg == null) return Collections.emptySet();
        return pkg.dependents.stream().map(p -> p.name).collect(Collectors.toSet());
    }

    void addPackage(Package pkg) {
        packageMap.put(pkg.name, pkg);
    }

    Package getPackage(String name) {
        return packageMap.computeIfAbsent(name, Package::new);
    }
}
