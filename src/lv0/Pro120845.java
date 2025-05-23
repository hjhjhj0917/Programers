package lv0;

import java.util.Scanner;

public class Pro120845 {

    static int solution(int[] box, int n) {
        int answer = 0;

        int n1 = box[0] / n;
        int n2 = box[1] / n;
        int n3 = box[2] / n;

        answer = n1 * n2 * n3;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] box = {10, 8, 6};
        int n = sc.nextInt();
        System.out.println(solution(box, n));
    }
}
