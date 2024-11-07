package etc;

public class Assignment2 {
//  두 개의 문자열s1과s2가 있다. 길이는s2가s1보다 1만큼만 더 길고,s2는s1의 재배열에 문자 하나를 더 추
//  가한 것이다(중간 어딘가에..). 본 PA는 s1에서 추가된 문자를 찾는 것이다.
//      Constraints:
//      - s1.length ≤ 100,000,000
//      - s1[i]와 s2[i]는 영문 알파벳 대/소문자 또는 숫자 중 하나

  public static void main(String[] args) {
    String s1 = "5TVOlDmHDoyx0zTtyRh4yV6";
    String s2 = "tzV65TROHylymoV504yhxDTD";

    // 하나의 배열을 사용하여 각 문자의 등장 여부를 기록
    int[] charCount = new int[123]; // ASCII 범위 내에서 숫자, 대문자, 소문자를 위한 배열
    char answer = '\u0000';

    // s1 문자열의 모든 문자에 대해 등장 횟수를 기록
    for (int i = 0; i < s1.length(); i++) {
      charCount[s1.charAt(i)]++;
    }

    // s2 문자열의 모든 문자에 대해 등장 횟수를 감소
    for (int i = 0; i < s2.length(); i++) {
      charCount[s2.charAt(i)]--;
    }

    // charCount 배열에서 값이 0이 아닌 인덱스를 찾음
    for (int i = 48; i <= 122; i++) {
      if (charCount[i] != 0) {
        answer = (char) i;
        break;
      }
    }

    System.out.println("answer = " + answer);
  }
}
