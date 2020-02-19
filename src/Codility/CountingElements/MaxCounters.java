package Codility.CountingElements;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {

        System.out.println(Solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));

    }

    public static int[] Solution(int N, int[] A) {

        // [0,0,0,0,0]
        int[] counter = new int[N];
        int tempMaxHistory = 0;
        int maxHistory = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == N + 1) {

                maxHistory = tempMaxHistory;
                continue;

            }

            if (counter[A[i] - 1] < maxHistory) {
                counter[A[i] - 1] = maxHistory;
            }

            tempMaxHistory = increase(counter, A[i] - 1, tempMaxHistory);

        }

        for (int i = 0; i < counter.length; i++) {

            if (counter[i] < maxHistory) {
                counter[i] = maxHistory;
            }

        }

        return counter;

    }

    public static int increase(int[] counter, int targetIdx, int tempMaxHistory) {

        counter[targetIdx] += 1;
        if (tempMaxHistory < counter[targetIdx]) {
            tempMaxHistory = counter[targetIdx];
        }
        return tempMaxHistory;

    }

}
