package Codility.TimeComplexity;

public class FrogJump {

    public static void main(String[] args) {

        solution(10, 85, 30);

    }

    public static int solution(int X, int Y, int D) {

        int distance = Y - X;
        int answer = 0;
        if (distance <= D) {
            answer = 1;
        } else {
            answer = distance % D == 0 ? (distance / D) : (distance / D) + 1;
        }

        return answer;

    }

}
