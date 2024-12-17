package cleancode;

public class Math {
    // 순열 계산 공식: nPr = n! / (n-r)!
    static int calculatePermutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // 조합 계산 공식: nCr = n! / (r! * (n-r)!)
    static int calculateCombination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // 팩토리얼 계산 함수
    static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
