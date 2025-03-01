package baekjoon;

import java.util.Scanner;

public class BOJ11727 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n + 2];
        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i-2] + d[i-2] + d[i-1]) % 10007;
        }

        System.out.println(d[n]);
    }

}
