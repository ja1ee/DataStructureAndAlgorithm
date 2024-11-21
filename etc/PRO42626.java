package etc;

import java.util.PriorityQueue;

public class PRO42626 {

    public static void main(String[] args) {
       int[] scoville = {2, 5, 7, 4, 9, 11, 13};
       int k = 7;
       int answer = 0;

       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for (int s : scoville) {
           pq.offer(s);
       }

       if (pq.peek() > k) {
           System.out.println(0);
       }

       while (pq.peek() < k && pq.size() >= 2) {
           int a = pq.poll();
           int b = pq.poll();
           int c = a + (b * 2);
           pq.offer(c);
           answer++;
       }

       if (pq.peek() < k) {
           System.out.println(-1);
       } else {
           System.out.println(answer);
       }
    }
}
