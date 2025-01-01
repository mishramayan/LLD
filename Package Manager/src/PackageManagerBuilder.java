import java.util.List;

class PackageManagerBuilder {
    private final PackageManager packageManager = new PackageManager();

    public PackageManagerBuilder addDependency(String packageName, List<String> dependencies) {
        Package pkg = packageManager.getPackage(packageName);
        for (String dependencyName : dependencies) {
            Package dependency = packageManager.getPackage(dependencyName);
            pkg.dependencies.add(dependency);
            dependency.dependents.add(pkg);
        }
        return this;
    }

    public PackageManager build() {
        return packageManager;
    }
}
