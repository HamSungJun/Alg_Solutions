package Codility.TimeComplexity;

public class TapeEquilibrium {

    public static void main(String[] args) {

        System.out.println(Solution(new int[]{-10, -20, -30, -40, 100}));

    }

    public static int Solution(int[] A) {

        int firstLeftDiff = A[0];
        int firstRightDiff = 0;
        for (int i = 1; i < A.length; i++) {
            firstRightDiff += A[i];
        }

        int minDiff = Math.abs(firstLeftDiff - firstRightDiff);

        if (A.length > 2) {

            for (int i = 1; i < A.length - 1; i++) {
                firstLeftDiff += A[i];
                firstRightDiff -= A[i];
                int nextDiff = Math.abs((firstLeftDiff) - (firstRightDiff));
                if (nextDiff < minDiff) {
                    minDiff = nextDiff;
                }

            }

        }

        return minDiff;

    }

}
