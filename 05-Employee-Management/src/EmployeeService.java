import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees;

    public EmployeeService() {

        employees = new ArrayList<>();

        employees.add(
                new Employee(101, "Asritha", 24, 75000, "IT"));

        employees.add(
                new Employee(102, "Sandeep", 23, 65000, "Development"));

        employees.add(
                new Employee(103, "Rahul", 27, 45000, "Testing"));

        employees.add(
                new Employee(104, "Priya", 25, 85000, "Development"));

        employees.add(
                new Employee(105, "Kiran", 30, 95000, "Management"));

        employees.add(
                new Employee(106, "Anu", 22, 40000, "Testing"));

        employees.add(
                new Employee(107, "Ravi", 28, 70000, "IT"));

        employees.add(
                new Employee(108, "Swathi", 26, 55000, "HR"));
    }

    public List<Employee> filterEmployees(EmployeeCondition condition) {

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {

            if (condition.test(employee)) {
                result.add(employee);
            }
        }

        return result;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}