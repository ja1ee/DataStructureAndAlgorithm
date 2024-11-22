package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11004 {
    static int N;
    static int[] arr;
    static int[] newArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        newArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        divide(0, N-1);

        System.out.println(newArr[K-1]);
    }

    private static void divide(int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        divide(start, mid);
        divide(mid+1, end);
        combine(start, end);
    }

    private static void combine(int start, int end) {
        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int newIdx = start;

        while (left <= mid && right <= end) {
            if(arr[left] < arr[right]) {
                newArr[newIdx++] = arr[left++];
            } else {
                newArr[newIdx++] = arr[right++];
            }
        }

        while (left <= mid) {
            newArr[newIdx++] = arr[left++];
        }

        while (right <= end) {
            newArr[newIdx++] = arr[right++];
        }

        for (int i = start; i <= end; i++) {
            arr[i] = newArr[i];
        }
    }

}
