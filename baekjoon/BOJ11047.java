package baekjoon;

import java.util.Scanner;

public class BOJ11047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            if (k >= coins[i]) {
                count += k / coins[i];
                k %= coins[i];
            } else if (k == 0) {
                break;
            }
        }

        System.out.println(count);
    }

}
