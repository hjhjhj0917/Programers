package lv0;

public class Pro181929 {

    static int solution(int[] num_list) {
        int answer = 0;
        int allHap = 0;
        int allMult = 1;

        for (int i = 0; i < num_list.length; i++) {
            allMult *= num_list[i];
        }
        for (int i = 0; i < num_list.length; i++) {
            allHap += num_list[i];
        }
        if (allMult < Math.pow(allHap, 2)) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(solution(num_list));
    }
}
