package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LEET2231 {
    public static int largestNumberWithParitySwaps(int num) {
        // Convert the number to a list of digits
        List<Integer> digits = new ArrayList<>();
        int temp = num;
        while (temp > 0) {
            digits.add(0, temp % 10); // Insert at the start to maintain order
            temp /= 10;
        }

        // Separate digits into odd and even lists
        List<Integer> oddDigits = new ArrayList<>();
        List<Integer> evenDigits = new ArrayList<>();
        for (int digit : digits) {
            if (digit % 2 == 0) {
                evenDigits.add(digit);
            } else {
                oddDigits.add(digit);
            }
        }

        // Sort both lists in descending order
        Collections.sort(oddDigits, Collections.reverseOrder());
        Collections.sort(evenDigits, Collections.reverseOrder());

        // Reconstruct the largest number with parity swaps
        StringBuilder result = new StringBuilder();
        int oddIndex = 0, evenIndex = 0;
        for (int digit : digits) {
            if (digit % 2 == 0) {
                result.append(evenDigits.get(evenIndex++));
            } else {
                result.append(oddDigits.get(oddIndex++));
            }
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        int num = 65875;
        System.out.println("Largest number: " + largestNumberWithParitySwaps(num)); // Output: 3412
    }
}
