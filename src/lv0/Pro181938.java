package lv0;

import java.util.Scanner;

public class Pro181938 {

    static int solution(int a, int b) {
        int answer = 0;

        String linkNumStr = Integer.toString(a) + Integer.toString(b);
        int linkNum = Integer.parseInt(linkNumStr);
        int multi = 2 * a * b;

        if (linkNum >= multi) {
            answer = linkNum;
        } else {
            answer = multi;
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
