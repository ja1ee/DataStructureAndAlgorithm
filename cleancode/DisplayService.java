package cleancode;

public class DisplayService {

    static void displayInitialScreen(String studentId, String studentName) {
        System.out.println("[ ID: " + studentId + " ]");
        System.out.println("[ Name: " + studentName + " ]");
        System.out.println();
        System.out.println("1. Permutation(nPr)");
        System.out.println("2. Combination(nCr)");
        System.out.println("3. Quit");
        System.out.print("> ");
    }

    static void printResult(int choice, int result) {
        String operation = (choice == 1) ? "nPr" : "nCr";
        System.out.println(operation + " = " + result);
        System.out.println();
    }
}
