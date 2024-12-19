package cleancode.common;

public class Math {

    // 순열 계산 공식: nPr = n! / (n-r)!
    public static int calculatePermutation(int n, int r) {
        if (r < 0 || n < r) {
            throw new IllegalArgumentException("입력값은 음수일 수 없으며, n >= r 이어야 합니다.");
        }
        return factorial(n) / factorial(n - r);
    }

    // 조합 계산 공식: nCr = n! / (r! * (n-r)!)
    public static int calculateCombination(int n, int r) {
        if (r < 0 || n < r) {
            throw new IllegalArgumentException("입력값은 음수일 수 없으며, n >= r 이어야 합니다.");
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // 팩토리얼 계산 함수
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("입력값은 음수일 수 없습니다.");
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
