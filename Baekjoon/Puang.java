package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Puang {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int weeks = Integer.parseInt(br.readLine());
    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 1; i <= weeks * 4; i++) {
      String[] arr = br.readLine().split(" ");
      for (int j = 0; j < 7; j++) {
        if (arr[j].equals("-")) {
          continue;
        } else if (map.containsKey(arr[j])) {
          map.put(arr[j], map.get(arr[j]) + times(i));
        } else {
          map.put(arr[j], times(i));
        }
      }
    }

    int min = 0;
    int max = 0;

    for (int value : map.values()) {
      if (min == 0) {
        min = value;
      }
      if (max == 0) {
        max = value;
      }

      if (value > max) {
        max = value;
      }
      if (value < min) {
        min = value;
      }
    }

    if (max - min <= 12) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

  private static int times(int i) {
    if (i % 2 == 1) {
      return 4;
    } else if (i % 2 == 0 && i % 4 != 0) {
      return 6;
    } else if (i % 4 == 0) {
      return 10;
    }
    return 0;
  }
}
