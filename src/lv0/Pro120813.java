package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120813 {

    static int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1 + (i * 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(n)));
    }
}
