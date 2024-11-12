package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ2161 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> inputDeque = new ArrayDeque<>();
        Deque<Integer> outputDeque = new ArrayDeque<>();

        // 큐 초기화
        for (int i = n; i >= 1; i--) {
            inputDeque.addLast(i);
        }

        for (int i = 1; i <= n; i++) {
            Integer output = inputDeque.pollLast();
            outputDeque.addLast(output);

            if (i != n) {
                Integer temp = inputDeque.pollLast();
                inputDeque.addFirst(temp);
            }
        }

        for (Integer que : outputDeque) {
            System.out.print(que + " ");
        }
    }

}
