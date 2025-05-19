package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120833 {

    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i - num1] = numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 3, 5};
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(Arrays.toString(solution(numbers, num1, num2)));
    }
}
