package lv0;

import java.util.Scanner;

public class Pro181878 {

    static int solution(String myString, String pat) {
        boolean found = myString.matches("(?i).*" + pat + ".*");
        return found ? 1 : 0;
//        String myString1 = myString.toLowerCase();
//        String pat1 = pat.toLowerCase();
//        if (myString1.replace(pat1, "").length() == myString1.length()) {
//            return 0;
//        }else {
//            return 1;
//        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();
        String pat = sc.nextLine();

        System.out.println(solution(myString, pat));
    }
}
