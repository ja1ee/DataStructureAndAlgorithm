package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class BOJ11557 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                String[] str = br.readLine().split(" ");
                if (map.containsKey(str[0])) {
                    map.put(str[0], map.get(str[0]) + Integer.parseInt(str[1]));
                } else {
                    map.put(str[0], Integer.parseInt(str[1]));
                }
            }

            Entry<String, Integer> entry = Collections.max(map.entrySet(), comparator);
            System.out.println(entry.getKey());
        }

    }





}
