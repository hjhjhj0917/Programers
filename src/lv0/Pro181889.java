package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181889 {

    static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_list = {1, 1, 2, 3, 4, 5};
        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
