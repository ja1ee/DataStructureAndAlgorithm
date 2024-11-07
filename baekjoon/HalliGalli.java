package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HalliGalli {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap<>();
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      if (map.containsKey(input[0])) {
        map.put(input[0], map.get(input[0]) + Integer.parseInt(input[1]));
      }else {
        map.put(input[0], Integer.parseInt(input[1]));
      }
    }

    if(map.containsValue(5)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}