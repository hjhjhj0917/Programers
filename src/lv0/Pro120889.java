package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120889 {

    static int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sides = {1, 2, 3};

        System.out.println(solution(sides));
    }
}
