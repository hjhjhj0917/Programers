package lv0;

import java.util.Scanner;

public class Pro181936 {

    static int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0 && number % m == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(solution(number, n, m));
    }
}
