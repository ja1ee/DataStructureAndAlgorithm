package etc;

import java.util.HashMap;
import java.util.Map;

public class Participant {

  public static void main(String[] args) {
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};
    String answer;
    Map<String, Integer> map = new HashMap<>();

    for (String s : participant) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }

    for (String s : completion) {
      map.put(s, map.getOrDefault(s, 0) - 1);
    }

    for(Map.Entry<String, Integer> entry : map.entrySet()) {
      if(entry.getValue() != 0) {
        answer = entry.getKey();
      }
    }
  }

}
