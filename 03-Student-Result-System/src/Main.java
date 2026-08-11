import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        // 1. Print all students
        System.out.println("\n---------All students---------");
        List<Student> allStds = service.getStudents();
        for (Student std : allStds) {
            System.out.println(std);
        }

        // 2. Passed students
        System.out.println("\n\n---------Passed students---------");
        List<Student> passedStudents = service.filterStudents(student -> student.getMark() >= 40);

        for (Student std : passedStudents) {
            System.out.println(std);
        }

        // 3. Failed students
        System.out.println("\n\n---------Failed studnets---------");
        List<Student> faileStudents = service.filterStudents(student -> student.getMark() < 40);
        faileStudents.forEach(System.out::println);

        // 4. Students who got A
        System.out.println("\n\n---------Students who got A---------");
        List<Student> gradAstds = service.filterStudents(student -> student.getGrade() == "A");
        gradAstds.forEach(System.out::println);

        // 5. Find Asritha
        System.out.println("\n\n---------Find Asritha---------");
        List<Student> asritha = service.filterStudents(student -> student.getName() == "Asritha");
        asritha.forEach(System.out::println);
    }
}
