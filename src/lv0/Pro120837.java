package lv0;

import java.util.Scanner;

public class Pro120837 {

    static int solution(int hp) {
        int answer = 0;
        int ant1 = hp / 5;
        int ant2 = (hp % 5) / 3;
        int ant3 = (hp % 5) % 3;

        if (hp >= 5) {
            answer = ant1 + ant2 + ant3;
        } else if (hp >= 3) {
            answer = ant2 + ant3;
        } else {
            answer = ant3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hp = sc.nextInt();
        System.out.println(solution(hp));
    }
}
