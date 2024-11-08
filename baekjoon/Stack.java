package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < n; i ++) {
      String input = br.readLine();
      String[] array = input.split(" ");

      if (array[0].equals("push")) {
        stack.push(Integer.parseInt(array[1]));
      } else if (array[0].equals("pop")) {
        isEmpty(stack, "pop");
      } else if (array[0].equals("size")) {
        System.out.println(stack.size());
      } else if (array[0].equals("empty")) {
        isEmpty(stack, "empty");
      } else if (array[0].equals("top")) {
        isEmpty(stack, "top");
      }
    }
  }

  public static void isEmpty(Deque<Integer> stack, String method) {
    Integer result = null;

    if (method.equals("pop")) {
      result = stack.isEmpty() ? -1 : stack.pop();
    } else if (method.equals("empty")) {
      result = stack.isEmpty() ? 1 : 0;
    } else if (method.equals("top")) {
      result = stack.isEmpty() ? -1 : stack.peek();
    }

    if (result != null) {
      System.out.println(result);
    }
  }
}