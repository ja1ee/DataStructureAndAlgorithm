package etc;

import java.util.*;

public class P12906 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {};
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (deque.peekLast() == arr[i]) {
               continue;
            }
            deque.addLast(arr[i]);
        }

        answer = deque.stream().mapToInt(Integer::intValue).toArray();
    }

}
