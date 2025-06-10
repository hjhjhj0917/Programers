package lv0;

import java.util.Scanner;

public class Pro181910 {

    static String solution(String my_string, int n) {
        String answer = "";

        for (int i = n; i > 0; i--) {
            answer += my_string.charAt(my_string.length() - i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(solution(my_string, n));
    }
}
