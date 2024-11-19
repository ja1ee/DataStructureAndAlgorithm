package etc;

import java.util.Collections;
import java.util.PriorityQueue;

import java.util.Arrays;

public class LEET2500 {
    public static int maxSumAfterOperations(int[][] grid) {
        int rows = grid.length - 1;
        int cols = grid[0].length - 1;
        int maxSum = 0;

        for (int[] row : grid) {
            Arrays.sort(row);
        }

        for (int col = cols; col >= 0; col--) { // 3
            int maxInColumn = 0;
            for (int row = rows; row >= 0; row--) { // 2
                maxInColumn = Math.max(maxInColumn, grid[row][col]);
            }
            maxSum += maxInColumn;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 4},
            {3, 3, 1}
        };

        int result = maxSumAfterOperations(grid);
        System.out.println("Output: " + result); // Expected Output: 8
    }
}