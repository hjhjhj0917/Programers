package lv0;

import java.util.Scanner;

public class Pro120839 {

    static String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer += "0";
            } else if (rsp.charAt(i) == '0') {
                answer += "5";
            } else if (rsp.charAt(i) == '5') {
                answer += "2";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rsp = sc.nextLine();
        System.out.println(solution(rsp));
    }
}
