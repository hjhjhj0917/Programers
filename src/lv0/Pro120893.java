package lv0;

import java.util.Scanner;

public class Pro120893 {

    static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += my_string.toLowerCase().charAt(i);
            } else {
                answer += my_string.toUpperCase().charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        System.out.println(solution(my_string));
    }
}
