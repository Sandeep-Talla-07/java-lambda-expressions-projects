import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student("Asritha", 100));
        students.add(new Student("Sandeep", 87));
        students.add(new Student("Sandhya", 95));
        students.add(new Student("Augusteen", 67));
        students.add(new Student("Sudheer", 38));
        students.add(new Student("Kiran", 74));
        students.add(new Student("Anu", 91));
    }

    public List<Student> filterStudents(StudentCondition stdCondition) {
        List<Student> ans = new ArrayList<>();

        for (Student std : students) {
            if (stdCondition.test(std)) {
                ans.add(std);
            }
        }
        return ans;
    }

    public List<Student> getStudents() {
        return students;
    }
}
