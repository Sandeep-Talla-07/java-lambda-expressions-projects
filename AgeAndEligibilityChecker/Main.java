package AgeAndEligibilityChecker;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        boolean isEligible = checkEligibility(age);

        System.out.print("Checking eligible for driving license: ");
        if (isEligible) {
            System.out.print("Yes eligible ✅");
        } else {
            System.out.println("Not eligible ❌");
        }

        System.out.print("Checking eligible for vote: ");
        if (isEligible) {
            System.out.print("Yes eligible ✅");
        } else {
            System.out.println("Not eligible ❌");
        }
    }

    private static boolean checkEligibility(int age) {
        Predicate<Integer> isEligible = personAge -> personAge >= 18;

        return isEligible.test(age);
    };
}
