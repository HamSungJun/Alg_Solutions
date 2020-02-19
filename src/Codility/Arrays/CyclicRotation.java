package Codility.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        solution(new int[]{1, 2, 3}, 3);

    }

    public static int[] solution(int[] A, int K) {
        if (A.length <= 1) return A;
        for (int i = 0; i < K; i++) {
            rotate(A);
        }

        return A;
    }

    public static void rotate(int[] A) {

        int temp = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
        A[0] = temp;

    }

}
