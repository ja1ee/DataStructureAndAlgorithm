package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] array = input.split(" ");
            Integer output = null;

            switch (array[0]) {
                case "push" : {
                    deque.addLast(Integer.parseInt(array[1]));
                    break;
                }
                case "pop" : {
                    output = deque.isEmpty() ? -1 : deque.pollFirst();
                    break;
                }
                case "size" : {
                    output = deque.size();
                    break;
                }
                case "empty" : {
                    output = deque.isEmpty() ? 1 : 0;
                    break;
                }
                case "front" : {
                    output = deque.isEmpty() ? -1 : deque.peekFirst();
                    break;
                }
                case "back" : {
                    output = deque.isEmpty() ? -1 : deque.peekLast();
                    break;
                }
            }

            if (!array[0].equals("push")) {
                sb.append(output);
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}
