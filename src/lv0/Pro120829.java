package lv0;

import java.util.Scanner;

public class Pro120829 {

    static int solution(int angle) {
        int answer = 4;
        if (angle < 90 && angle > 0) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180 && angle > 90) {
            answer = 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angle = sc.nextInt();

        System.out.println(solution(angle));
    }
}
