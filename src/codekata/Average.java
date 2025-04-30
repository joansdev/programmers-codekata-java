package codekata;

public class Average {

    // 배열 안 값들 평균값 반환
    public double solution(int[] numbers) { // int[] numbers = {1,2,3,4,5}
        double answer = 0;
        for (int num : numbers) {
            answer += num;
        }
        return (answer / numbers.length);
    }
}
