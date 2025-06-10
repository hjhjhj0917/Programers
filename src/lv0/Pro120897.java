package lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pro120897 {

    static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
