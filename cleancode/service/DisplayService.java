package cleancode.service;

public class DisplayService {

    public static void initialScreen(String studentId, String studentName) {
        System.out.printf("[ ID: %s ]%n", studentId);
        System.out.printf("[ Name: %s ]%n", studentName);
        System.out.println();
        System.out.println("1. Permutation(nPr)");
        System.out.println("2. Combination(nCr)");
        System.out.println("3. Quit");
        System.out.print("> ");
    }

    public static void displayResult(int choice, int result) {
        String operation = (choice == 1) ? "nPr" : "nCr";
        System.out.printf("%s = %d%n", operation, result);
        System.out.println();
    }
}
