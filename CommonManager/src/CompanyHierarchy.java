public class CompanyHierarchy {
    public static Employee findManager(Employee root, Employee emp1, Employee emp2) {

        // Base case: If root is null or matches one of the employees, return root
        if(root == null || root == emp1 || root == emp2) return root;

        // Initialize a count to track matching nodes in the reports
        int count = 0;
        Employee temp = null;

        // Traverse through all direct reports of the current node
        for(Employee report : root.reports){
            Employee result = findManager(report, emp1, emp2);
            if(result != null){
                count++;
                temp = result;
            }
        }

        // If two reports found, return the not-null, current root is the least common manager
        if(count >= 2){
            return root;
        }

        // Otherwise, return the found not-null employee
        return temp;
    }
}
