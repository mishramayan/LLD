import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PackageManagerBuilder builder = new PackageManagerBuilder();

        // Add dependencies
        builder.addDependency("A", Arrays.asList("B", "C"))
                .addDependency("B", Arrays.asList("D", "E", "F"))
                .addDependency("C", Arrays.asList("F"))
                .addDependency("F", Arrays.asList("G"));

        PackageManager packageManager = builder.build();

        // Install package A
        packageManager.install("A", true);

        // List consumed packages for A
        System.out.println("Consumed by A: " + packageManager.getConsumedPackages("A"));

        // List consuming packages for G
        System.out.println("Consuming G: " + packageManager.getConsumingPackages("G"));

        // Uninstall package A
        packageManager.uninstallPackage("A");
    }
}
