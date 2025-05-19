package lv0;

import java.util.Arrays;

public class Pro120809 {

    static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution(numbers)));
    }
}
