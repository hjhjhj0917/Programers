package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181892 {

    static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - (n - 1)] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {5, 2, 1, 7, 5};
        int n = sc.nextInt();

        System.out.println(Arrays.toString(solution(array, n)));
    }
}
