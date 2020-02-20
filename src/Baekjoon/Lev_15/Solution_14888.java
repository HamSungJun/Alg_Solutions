package Baekjoon.Lev_15;

import java.io.*;
import java.util.*;

public class Solution_14888 {

    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        N = Integer.parseInt(br.readLine());

        StringTokenizer nst = new StringTokenizer(br.readLine(), " ");
        StringTokenizer ost = new StringTokenizer(br.readLine(), " ");

        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = (Integer.parseInt(nst.nextToken()));
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(ost.nextToken());
        }

        backTrack(1, numbers[0]);

        bw.write("" + maxValue + "\n" + minValue);
        bw.flush();
        bw.close();

    }

    public static void backTrack(int idx, int sum) {

        if (idx >= N) {
            maxValue = Math.max(sum, maxValue);
            minValue = Math.min(sum, minValue);
            return;
        }

        for (int i = 0; i < 4; i++) {

            if (operators[i] == 0) continue;

            int nextOp = i;
            operators[i]--;

            switch (nextOp) {
                case 0:
                    backTrack(idx + 1, sum + numbers[idx]);
                    break;
                case 1:
                    backTrack(idx + 1, sum - numbers[idx]);
                    break;
                case 2:
                    backTrack(idx + 1, sum * numbers[idx]);
                    break;
                case 3:
                    backTrack(idx + 1, sum / numbers[idx]);
                    break;
            }

            operators[i]++;

        }

    }

}
