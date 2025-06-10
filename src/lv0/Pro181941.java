package lv0;

public class Pro181941 {

    static String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] arr = {"a","b","c"};
        System.out.println(solution(arr));
    }
}
