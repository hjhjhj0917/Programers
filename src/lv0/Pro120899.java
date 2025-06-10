package lv0;

import java.util.Arrays;

public class Pro120899 {

    static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }

    public static void main(String[] args) {

        int[] array = {9, 10, 11, 8};
        System.out.println(Arrays.toString(solution(array)));
    }
}
