import java.util.HashSet;

/**
 * Base class employee.
 * Unique ID, Name, Pointer to manager, null for the CEO
 * Set of direct reports
 * */
public class Employee {
    long id;
    String name;
    Employee manager;
    HashSet<Employee> reports;

    // Constructor
    public Employee(long id, String name, Employee manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.reports = new HashSet<>();
    }
}
