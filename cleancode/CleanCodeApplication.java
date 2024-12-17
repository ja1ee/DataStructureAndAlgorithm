package cleancode;

import java.util.Scanner;

public class CleanCodeApplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = "2112812";
        String studentName = "이정아";

        while (true) {
            DisplayService.displayInitialScreen(studentId, studentName);
            int choice = scanner.nextInt();

            if (choice == 3) {
                scanner.close();
                break;
            }

            handlePrompt(choice);
        }
    }

    static void handlePrompt(int choice) {
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.print("Input r: ");
        int r = scanner.nextInt();

        int result = getResult(choice, n, r);

        DisplayService.printResult(choice, result);
    }

    static int getResult(int choice, int n, int r) {
        if (choice == 1) {
            return Math.calculatePermutation(n, r);
        } else if (choice == 2) {
            return Math.calculateCombination(n, r);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
