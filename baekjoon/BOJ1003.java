package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static long[] dynamicArray = new long[1000001];

    static void preprocessing () {
        dynamicArray[1] = 1;
        dynamicArray[2] = 2;
        dynamicArray[3] = 4;

        for (int i = 4; i <= 1000000; i++) {
            dynamicArray[i] = (dynamicArray[i-1] + dynamicArray[i-2] +dynamicArray[i-3]) % 1000000009;
        }
    }

    public static void main(String[] args) throws IOException {
        preprocessing();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            sb.append(dynamicArray[input]).append("\n");
        }

        System.out.println(sb);
    }

}
