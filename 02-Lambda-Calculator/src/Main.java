import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> a / b);
        operations.put("%", (a, b) -> a % b);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int add = operations.get("+").apply(num1, num2);
        int sub = operations.get("-").apply(num1, num2);
        int mul = operations.get("*").apply(num1, num2);
        int div = operations.get("/").apply(num1, num2);
        int mod = operations.get("%").apply(num1, num2);

        System.out.println("\nSum of " + num1 + " and " + num2 + " is: " + add);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + sub);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + mul);
        System.out.println("Division of " + num1 + " and " + num2 + " is: " + div);
        System.out.println("Modulus of " + num1 + " and " + num2 + " is: " + mod + "\n");
    }
}
