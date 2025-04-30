package codekata;


public class Divide {
    public int solution(int num1, int num2) {
        if (isInRange(num1) && isInRange(num2)) {
            return (num1 / num2) * 1000;
        }
        return 0; // 혹은 예외 처리
    }

    private boolean isInRange(int n) {
        return n >= -50000 && n <= 50000;
    }
}
