package lv0;

import java.util.Scanner;

public class Pro181939 {

    static int solution(int a, int b) {
        int answer = 0;

        String linkNumStr1 = Integer.toString(a) + Integer.toString(b);
        String linkNumStr2 = Integer.toString(b) + Integer.toString(a);
        int linkNum1 = Integer.parseInt(linkNumStr1);
        int linkNum2 = Integer.parseInt(linkNumStr2);

        if (linkNum1 >= linkNum2) {
            answer = linkNum1;
        } else {
            answer = linkNum2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }
}
