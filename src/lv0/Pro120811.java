package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120811 {

    static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        answer = array[(array.length) / 2];

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 7, 10, 11};

        System.out.println(solution(array));
    }
}
