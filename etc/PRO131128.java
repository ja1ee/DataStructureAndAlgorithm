package etc;

import java.util.HashMap;

public class PRO131128 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String X = "100";
        String Y = "123450";

        HashMap<String, Integer> xMap = new HashMap<>();
        HashMap<String, Integer> yMap = new HashMap<>();
        for (int i = 0; i < X.length(); i++) {
            String num = String.valueOf(X.charAt(i));
            putMap(xMap, num);
        }

        for (int i = 0; i < Y.length(); i++) {
            String num = String.valueOf(Y.charAt(i));
            putMap(yMap, num);
        }

        for (int i = 9; i >= 0; i--) {
            if (xMap.get(String.valueOf(i)) != null && yMap.get(String.valueOf(i)) != null) {
            int x = xMap.get(String.valueOf(i));
            int y = yMap.get(String.valueOf(i));
                //System.out.println("i = " + i + " count = " + x + " " + y);
            int count = Math.min(x, y);
                for (int k = 0; k < count; k++) {
                    sb.append(i);
                }
            }
        }

        if (sb.toString().isEmpty()) {
           System.out.println("-1");
        } else if (sb.substring(0, 1).equals("0")) {
           System.out.println("0");
        } else {
           System.out.println(sb);
        }
    }

    private static void putMap(HashMap<String, Integer> map, String num) {
        if (map.get(num) != null) {
            map.put(num, map.get(num) + 1);
        } else {
            map.put(num, 1);
        }
    }

}
