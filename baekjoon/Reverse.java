package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= n; i ++) {
      StringBuilder sb = new StringBuilder();
      String[] input = br.readLine().split(" ");

      for (int j = input.length - 1; j >= 0; j--) {
        sb.append(input[j]);
        if(j != 0) {
          sb.append(" ");
        }
      }
      System.out.print("Case #" + i + ": ");
      System.out.println(sb);
    }
  }
}
