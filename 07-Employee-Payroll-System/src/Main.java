import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        PayrollService service = new PayrollService();

        List<Employee> allEmployees = service.getEmployees();
        System.out.println("\n\n--------------All Employees--------------");
        allEmployees.forEach(System.out::println);

        // 1. Predicate + Lambda

        System.out.println("\n\n--------------Salary above 60000--------------");
        Predicate<Employee> highSalary = employee -> employee.getSalary() >= 60000;

        for (Employee employee : allEmployees) {
            if (highSalary.test(employee)) {
                System.out.println(employee);
            }
        }

        // 2. Predicate + Lambda
        System.out.println("\n\n--------------Department is Development--------------");
        Predicate<Employee> empDepart = employee -> employee.getDepartment().equals("Development");

        for (Employee employee : allEmployees) {
            if (empDepart.test(employee)) {
                System.out.println(employee);
            }
        }

        // 3. Consumer + Method Reference
        System.out.println("\n\n--------------DISPLAY USING METHOD REFERENCE--------------");
        Consumer<Employee> displayUsingReference = Employee::display;

        for (Employee employee : allEmployees) {
            displayUsingReference.accept(employee);
        }

        // 4. Instance Method Reference (use an existing employee)
        System.out.println("\n\n--------------WELCOME MESSAGE--------------");
        Runnable welcomeMsg;
        if (!allEmployees.isEmpty()) {
            welcomeMsg = allEmployees.get(0)::printWelcomeMessage;
        } else {
            welcomeMsg = () -> {
            };
        }
        welcomeMsg.run();

        // 5. Function + Lambda
        System.out.println("\n\n--------------EMPLOYEE NAMES--------------");
        Function<Employee, String> empNames = employee -> employee.getName();

        for (Employee employee : allEmployees) {
            System.out.println(empNames.apply(employee));
        }

        // 6. Function + Method Reference
        System.out.println("\n\n--------------NAMES USING METHOD REFERENCE--------------");

        Function<Employee, String> getNameReference = Employee::getName;

        for (Employee employee : allEmployees) {
            System.out.println(getNameReference.apply(employee));
        }

        // 7. Get Salary using Method Reference
        System.out.println("\n\n--------------SALARIES--------------");
        Function<Employee, Double> getSalaryReference = Employee::getSalary;
        for (Employee employee : allEmployees) {
            System.out.println(getSalaryReference.apply(employee));
        }

        System.out.println("\n\n--------------NAME and SALARIES--------------");
        Function<Employee, Double> getNameSalaryReference = Employee::getSalary;
        for (Employee employee : allEmployees) {
            System.out.println(employee.getName() + " --> " + getSalaryReference.apply(employee));
        }

        // 8. Calculate Bonus using Static Method Reference
        System.out.println("\n\n--------------BONUS--------------");
        BiFunction<Employee, Double, Double> calculateBonus = Employee::calculateBonus;

        for (Employee employee : allEmployees) {
            double bonus = calculateBonus.apply(employee, employee.getSalary());
            System.out.println(employee.getName() + " --> " + bonus);
        }

        // ==================================================
        // 9. Generate Employee Code
        // ==================================================

        System.out.println("\n========== EMPLOYEE CODES ==========");

        Function<Employee, String> employeeCode = Employee::createEmployeeCode;

        for (Employee employee : allEmployees) {

            System.out.println(
                    employeeCode.apply(employee)
                            + " -> "
                            + employee.getName());
        }

        // ==================================================
        // 10. Sort by Name using Lambda
        // ==================================================

        System.out.println("\n========== SORT BY NAME ==========");

        allEmployees.sort(
                (e1, e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee employee : allEmployees) {

            System.out.println(employee);
        }

        // ==================================================
        // 11. Sort by Name using Method Reference
        // ==================================================

        System.out.println(
                "\n========== SORT BY NAME USING METHOD REFERENCE ==========");

        allEmployees.sort(
                Comparator.comparing(Employee::getName));

        for (Employee employee : allEmployees) {

            System.out.println(employee);
        }

        // ==================================================
        // 12. Sort by Salary
        // ==================================================

        System.out.println("\n========== SORT BY SALARY ==========");

        allEmployees.sort(
                Comparator.comparing(Employee::getSalary));

        for (Employee employee : allEmployees) {

            System.out.println(employee);
        }

        // ==================================================
        // 13. Sort by Salary Descending
        // ==================================================

        System.out.println("\n========== SALARY DESCENDING ==========");

        allEmployees.sort(
                Comparator.comparing(
                        Employee::getSalary).reversed());

        for (Employee employee : allEmployees) {

            System.out.println(employee);
        }

        // ==================================================
        // 14. Sort by Department
        // ==================================================

        System.out.println("\n========== SORT BY DEPARTMENT ==========");

        allEmployees.sort(
                Comparator.comparing(Employee::getDepartment));

        for (Employee employee : allEmployees) {

            System.out.println(employee);
        }

        // ==================================================
        // 15. Sort by Department + Salary
        // ==================================================

        System.out.println(
                "\n========== DEPARTMENT + SALARY ==========");

        allEmployees.sort(
                Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary));

        for (Employee employee : allEmployees) {

            System.out.println(employee);
        }

        // ==================================================
        // 16. Supplier
        // ==================================================

        System.out.println("\n========== SUPPLIER ==========");

        Supplier<String> company = () -> "Asritha Technologies";

        System.out.println(
                "Company: " + company.get());
    }
}