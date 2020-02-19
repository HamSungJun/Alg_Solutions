package Codility.CountingElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

        System.out.println(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));

    }

    public static int solution(int X, int[] A) {

        if (A.length == 0) return (-1);

        int endAt = -1;
        Set<Integer> checker = new HashSet<>();

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= X) {
                checker.add(A[i]);
            }

            if (checker.size() == X) {
                endAt = i;
                break;
            }

        }

        return endAt;

    }

}
