package lv0;

import java.util.Scanner;

public class Pro120830 {

    static int solution(int n, int k) {
        int answer = 0;

        if (n >= 10) {
            answer = (n * 12000) + (k * 2000) - (2000 * (n / 10));
        } else {
            answer = (n * 12000) + (k * 2000);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n, k));
    }
}
