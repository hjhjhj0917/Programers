package lv0;

import java.util.Scanner;

public class Pro181935 {

    static int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 1; i <= n / 2; i++) {
                answer += (int)Math.pow(i * 2, 2);
            }
        } else {
            for (int i = 1; i <= (n + 1) / 2; i++) {
                answer += (i * 2) - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
