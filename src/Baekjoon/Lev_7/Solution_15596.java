package Baekjoon.Lev_7;

public class Solution_15596 {

    long sum(int[] a) {

        long acc = 0;
        for (int i = 0; i < a.length; i++) {
            acc += a[i];
        }
        return acc;

    }

}

