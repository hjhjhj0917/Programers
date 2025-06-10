package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181920 {

    static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i = start_num; i <= end_num; i++) {
            answer [i - start_num] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start_num = sc.nextInt();
        int end_num = sc.nextInt();
        System.out.println(Arrays.toString(solution(start_num, end_num)));
    }
}
