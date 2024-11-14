package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ26042 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        Integer[] output = {0, null};

        for (int i = 0; i < n; i++) {
            // 줄 서기
            String[] array = br.readLine().split(" ");
            if (array[0].equals("1")) {
                queue.addLast(Integer.parseInt(array[1]));
            } else {
                queue.removeFirst();
            }

            // 최대 대기 인원 저장
            if (output[0] < queue.size()) {
                output[0] = queue.size();
                output[1] = queue.getLast();
            } else if (output[0] == queue.size()) {
                int min = output[1];
                int candidateMin = queue.getLast();

                if (min > candidateMin) {
                    output[1] = candidateMin;
                }
            }
        }

        for (int i : output) {
           System.out.print(i + " ");
        }


    }

}
