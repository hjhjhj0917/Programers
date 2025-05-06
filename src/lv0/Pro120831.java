package lv0;

import java.util.Scanner;

public class Pro120831 {

    static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
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
