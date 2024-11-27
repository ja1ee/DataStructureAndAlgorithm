package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            br.readLine();
            int maxSejun = 0;
            int maxSebi = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int sejun = Integer.parseInt(st.nextToken());
                if (sejun > maxSejun) {
                    maxSejun = sejun;
                }
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int sebi = Integer.parseInt(st.nextToken());
                if (sebi > maxSebi) {
                    maxSebi = sebi;
                }
            }

            if (maxSebi > maxSejun) {
                System.out.println("B");
            } else {
                System.out.println("S");
            }

        }
    }

}
