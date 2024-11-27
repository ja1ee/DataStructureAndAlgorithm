package baekjoon;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ1755 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = m; i <= n ; i++) {
            String number = convert(String.valueOf(i));
            map.put(i, number);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });

        for (Integer key : keySet) {
            count++;
            System.out.print(key + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static String convert(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            switch (c) {
                case '0' : sb.append("zero").append(" "); break;
                case '1' : sb.append("one").append(" "); break;
                case '2' : sb.append("two").append(" "); break;
                case '3' : sb.append("three").append(" "); break;
                case '4' : sb.append("four").append(" "); break;
                case '5' : sb.append("five").append(" "); break;
                case '6' : sb.append("six").append(" "); break;
                case '7' : sb.append("seven").append(" "); break;
                case '8' : sb.append("eight").append(" "); break;
                case '9' : sb.append("nine").append(" "); break;
            }
        }
        return sb.toString();
    }
}
