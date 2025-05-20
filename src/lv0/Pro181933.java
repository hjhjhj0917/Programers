package lv0;

import java.util.Scanner;

public class Pro181933 {

    static int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = sc.nextBoolean();
        System.out.println(solution(a, b, flag));
    }
}
