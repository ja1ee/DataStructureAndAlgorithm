package cleancode;

import cleancode.common.Math;
import cleancode.common.Operation;
import cleancode.service.DisplayService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "2112812";
        String studentName = "이정아";

        while (true) {
            DisplayService.initialScreen(studentId, studentName);
            int choice = scanner.nextInt();

            if (choice == Operation.EXIT) {
                scanner.close();
                break;
            }

            getUserInputAndDisplayResult(scanner, choice);
        }
    }

    static void getUserInputAndDisplayResult(Scanner scanner, int choice) {
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.print("Input r: ");
        int r = scanner.nextInt();

        int result = calculate(choice, n, r);
        DisplayService.displayResult(choice, result);
    }

    static int calculate(int choice, int n, int r) {
		return switch (choice) {
            case Operation.PERMUTATION -> Math.calculatePermutation(n, r);
            case Operation.COMBINATION -> Math.calculateCombination(n, r);
			default -> throw new IllegalArgumentException("Invalid choice");
		};
    }
}
