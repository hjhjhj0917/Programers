package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120850 {

    static int[] solution(String my_string) {
        StringBuilder my_words = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                my_words.append(ch);
            }
        }
        int[] answer = new int[my_words.length()];

        for (int i = 0; i < my_words.length(); i++) {
            answer[i] = my_words.charAt(i) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        System.out.println(Arrays.toString(solution(my_string)));
    }
}
