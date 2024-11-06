package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PasswordOfMinjun {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Set<String> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
      String password = br.readLine();
      set.add(password);

      StringBuilder sb = new StringBuilder(password);
      String reverse = sb.reverse().toString();

      if(set.contains(reverse)) {
        System.out.println(reverse.length() + " " + reverse.charAt(reverse.length() / 2));
        break;
      }
    }
  }
}
