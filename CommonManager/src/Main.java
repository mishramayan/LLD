import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CompanyHierarchy hierarchy = new CompanyHierarchy();

        Employee ceo = new Employee(1, "CEO", null);
        Employee a = new Employee(2, "A", ceo);
        Employee b = new Employee(3, "B", ceo);
        Employee c = new Employee(4, "C", a);
        Employee d = new Employee(5, "D", a);
        Employee e = new Employee(6, "E", b);
        Employee f = new Employee(7, "F", b);

        ceo.reports.add(a);
        ceo.reports.add(b);
        a.reports.add(c);
        a.reports.add(d);
        b.reports.add(e);
        b.reports.add(f);

        // Find least common manager
        Employee boss = hierarchy.findManager(ceo, c, d);
        System.out.println("The least common manager of C and D is: " + boss.name);

        boss = hierarchy.findManager(ceo, c, f);
        System.out.println("The least common manager of C and F is: " + boss.name);
    }
}