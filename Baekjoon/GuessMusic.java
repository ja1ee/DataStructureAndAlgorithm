package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GuessMusic {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] N = br.readLine().split(" ");
    Map<String, String> map = new HashMap<>();

    for (int i = 0; i < Integer.parseInt(N[0]); i++) {
      String input[] = br.readLine().split(" ", 2);
      String music = input[1];
      int musicLength = Integer.parseInt(input[0]);

      String name = music.substring(0, musicLength);
      String melody = music.substring(musicLength + 1, musicLength + 6);
      map.put(name, melody);
    }

    for (int i = 0; i < Integer.parseInt(N[1]); i++) {
      String input = br.readLine();
      String name = "";

      int count = 0;
      for (Map.Entry<String, String> entry : map.entrySet()) {
        if (Objects.equals(entry.getValue(), input)) {
          name = entry.getKey();
          count++;
        }
      }

      if (count > 1) {
        System.out.println("?");
      } else if (count == 0) {
        System.out.println("!");
      } else if (count == 1) {
        System.out.println(name);
      }
    }
  }
}
