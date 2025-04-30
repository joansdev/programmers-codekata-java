package codekata;

public class Age {

    // 나이 입력 받고 출생연도 구하기
    public int solution(int age) {
        int answer = 0;
        if (0 < age && age <= 120) {
            answer = (2022 - age) + 1;
        }
        return answer;
    }
}
