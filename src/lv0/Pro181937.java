package lv0;

import java.util.Scanner;

public class Pro181937 {

    static int solution(int num, int n) {
        int answer = 0;

        if (num % n == 0) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solution(num, n));
    }
}
