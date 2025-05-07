package lv0;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120854 {

    static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] strlist = str.split(" ");

        System.out.println(Arrays.toString(solution(strlist)));
    }
}
