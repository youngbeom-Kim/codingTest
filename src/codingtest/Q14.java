package codingtest;

//프로그래머스 > 약수의 개수와 덧셈
public class Q14 {
    public int solution(int left, int right) {
        int answer = 0;

        while (left <= right) {
            int count = 0;
            for (int i = 1; i <= left; i++) {
                if (left % i == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += left;
            } else {
                answer -= left;
            }
            left++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q14 sol = new Q14();

        int left = 13;
        int right = 17;
        System.out.println(sol.solution(left, right));

        left = 24;
        right = 27;
        System.out.println(sol.solution(left, right));

    }
}
