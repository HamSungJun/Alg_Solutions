package Codility.PrefixSums;

import java.util.*;

public class GenomicRangeQuery {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("CCGATCG", new int[]{0, 0, 1}, new int[]{0, 1, 1})));

    }

    public static int[] solution(String S, int[] P, int[] Q) {

        int[] result = new int[P.length];
        int[] convertA = new int[S.length()];
        int[] convertC = new int[S.length()];
        int[] convertG = new int[S.length()];
        int A = -1;
        int C = -1;
        int G = -1;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') A = i;
            if (S.charAt(i) == 'C') C = i;
            if (S.charAt(i) == 'G') G = i;
            convertA[i] = A;
            convertC[i] = C;
            convertG[i] = G;
        }

        for (int i = 0; i < P.length; i++) {
            result[i] = 4;
            if (P[i] <= convertA[Q[i]] && convertA[Q[i]] <= Q[i]) {
                result[i] = 1;
                continue;
            }
            if (P[i] <= convertC[Q[i]] && convertC[Q[i]] <= Q[i]) {
                result[i] = 2;
                continue;
            }
            if (P[i] <= convertG[Q[i]] && convertG[Q[i]] <= Q[i]) {
                result[i] = 3;
                continue;
            }
        }

        return result;

    }


}
