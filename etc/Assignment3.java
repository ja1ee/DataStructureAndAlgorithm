package etc;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        int len = 5;

        Scanner sc = new Scanner(System.in);

        int[][] cost = new int[len][];
        for (int i = 0; i < len; i++) {
            cost[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                cost[i][j] = sc.nextInt();
            }
        }

        // cost
        int maxCost = 0;

        int length = cost.length;

        int[][] array = new int[length+1][length+1];

        array[1][1] = cost[0][0];
        for (int i = 2; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                array[i][j] = Math.max(array[i][j-1], array[i-1][j]) + cost[i-1][j-1];
            }
        }

        for (int i = 1; i <= length; i++) {
            maxCost = Math.max(maxCost, array[length][i]);
        }

        System.out.println(maxCost);



    }

}
