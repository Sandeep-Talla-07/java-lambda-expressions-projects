import java.util.ArrayList;
import java.util.List;

public class PayrollService {
    private List<Employee> employees = new ArrayList<>();

    public PayrollService() {
        employees.add(
                new Employee(101, "Asritha", 75000, "IT"));

        employees.add(
                new Employee(102, "Sandeep", 65000, "Development"));

        employees.add(
                new Employee(103, "Rahul", 45000, "Testing"));

        employees.add(
                new Employee(104, "Priya", 85000, "Development"));

        employees.add(
                new Employee(105, "Kiran", 95000, "Management"));

        employees.add(
                new Employee(106, "Anu", 55000, "IT"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
