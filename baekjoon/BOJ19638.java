package baekjoon;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ19638 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int centi = sc.nextInt();
        int t = sc.nextInt();

        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            maxHeap.offer(sc.nextInt());
        }

        for (int i = 0; i < t; i ++) {
            int temp = maxHeap.peek();

            if (temp < centi || temp == 1) {
                t = i;
                break;
            }

            temp = maxHeap.poll() / 2;
            maxHeap.offer(temp);
        }

        if (maxHeap.peek() >= centi) {
            System.out.println("NO");
            System.out.println(maxHeap.peek());
        } else {
            System.out.println("YES");
            System.out.println(t);
        }
    }

}
