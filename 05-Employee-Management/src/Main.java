import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        // ==================================================
        // 1. Display all employees
        // ==================================================

        System.out.println("========== ALL EMPLOYEES ==========");

        for (Employee employee : service.getEmployees()) {
            System.out.println(employee);
        }

        // ==================================================
        // 2. Employees with salary > 60000
        // ==================================================

        System.out.println("\n========== SALARY > 60000 ==========");

        List<Employee> highSalaryEmployees = service.filterEmployees(
                employee -> employee.getSalary() > 60000);

        for (Employee employee : highSalaryEmployees) {
            System.out.println(employee);
        }

        // ==================================================
        // 3. Employees from Development department
        // ==================================================

        System.out.println("\n========== DEVELOPMENT EMPLOYEES ==========");

        List<Employee> developers = service.filterEmployees(
                employee -> employee.getDepartment().equals("Development"));

        for (Employee employee : developers) {
            System.out.println(employee);
        }

        // ==================================================
        // 4. Employees younger than 25
        // ==================================================

        System.out.println("\n========== EMPLOYEES UNDER 25 ==========");

        List<Employee> youngEmployees = service.filterEmployees(
                employee -> employee.getAge() < 25);

        for (Employee employee : youngEmployees) {
            System.out.println(employee);
        }

        // ==================================================
        // 5. Development employees with salary > 60000
        // ==================================================

        System.out.println("\n========== DEVELOPERS WITH HIGH SALARY ==========");

        List<Employee> highPaidDevelopers = service.filterEmployees(
                employee -> employee.getDepartment().equals("Development")
                        && employee.getSalary() > 60000);

        for (Employee employee : highPaidDevelopers) {
            System.out.println(employee);
        }

        // ==================================================
        // 6. Employees with salary between 50000 and 80000
        // ==================================================

        System.out.println("\n========== SALARY BETWEEN 50000 AND 80000 ==========");

        List<Employee> mediumSalaryEmployees = service.filterEmployees(
                employee -> employee.getSalary() >= 50000
                        && employee.getSalary() <= 80000);

        for (Employee employee : mediumSalaryEmployees) {
            System.out.println(employee);
        }

        // ==================================================
        // 7. Employees whose name starts with S
        // ==================================================

        System.out.println("\n========== NAMES STARTING WITH S ==========");

        List<Employee> sEmployees = service.filterEmployees(
                employee -> employee.getName().startsWith("S"));

        for (Employee employee : sEmployees) {
            System.out.println(employee);
        }

        // ==================================================
        // 8. Sort employees by salary
        // ==================================================

        System.out.println("\n========== SORT BY SALARY ==========");

        List<Employee> sortedEmployees = service.getEmployees();

        Collections.sort(
                sortedEmployees,
                (Employee e1, Employee e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }

        // ==================================================
        // 9. Sort employees by salary descending
        // ==================================================

        System.out.println("\n========== SORT BY SALARY DESCENDING ==========");

        Collections.sort(
                sortedEmployees,
                (Employee e1, Employee e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }

        // ==================================================
        // 10. Sort employees by name
        // ==================================================

        System.out.println("\n========== SORT BY NAME ==========");

        Collections.sort(
                sortedEmployees,
                (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}