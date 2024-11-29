package baekjoon;

import java.util.Scanner;

public class BOJ13419 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 단어 개수 입력
        scanner.nextLine(); // 버퍼 비우기

        for (int i = 0; i < n; i++) {
            String arr = scanner.nextLine(); // 단어 입력
            int len = arr.length();

            StringBuilder a = new StringBuilder(); // 첫 번째 문자열 저장
            StringBuilder b = new StringBuilder(); // 두 번째 문자열 저장

            // 길이가 짝수인 경우
            if (len % 2 == 0) {
                for (int k = 0; k < len; k++) {
                    if (k % 2 == 0) {
                        a.append(arr.charAt(k));
                    } else {
                        b.append(arr.charAt(k));
                    }
                }
            }
            // 길이가 홀수인 경우
            else {
                for (int k = 0; k < len; k++) {
                    if (k % 2 == 0) {
                        a.append(arr.charAt(k));
                    } else {
                        b.append(arr.charAt(k));
                    }
                }
                for (int k = 0; k < len; k++) {
                    if (k % 2 == 0) {
                        b.append(arr.charAt(k));
                    } else {
                        a.append(arr.charAt(k));
                    }
                }
            }

            System.out.println(a);
            System.out.println(b);
        }

        scanner.close();
    }
}