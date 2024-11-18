package etc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LEET2558 {

    public static void main(String[] args) {

        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;

        pickGifts(gifts, k);
    }

    public static void pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < gifts.length; i++) {
            pq.offer(gifts[i]);
        }

        for (int i = 0; i < k; i++) {
            Integer temp = (int) Math.floor(Math.sqrt(pq.poll()));
            pq.offer(temp);
        }

        long sum = 0;
        int n = pq.size();
        for (int i = 0; i < n; i++) {
            sum = sum + pq.poll();
        }
        System.out.println(sum);
    }
}
