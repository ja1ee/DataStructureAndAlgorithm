package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1417 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        int dasom = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            pq.offer(sc.nextInt());
        }

        if (!pq.isEmpty()) {
            while (dasom <= pq.peek()) {
                pq.offer(pq.poll() - 1);
                count++;
                dasom++;
            }
        }

        System.out.println(count);
    }

}
