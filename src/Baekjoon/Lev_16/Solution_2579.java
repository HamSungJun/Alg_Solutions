package Baekjoon.Lev_16;

import java.io.*;

public class Solution_2579 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N];
        int[] stairSum = new int[N];
        for (int i = 0; i < N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        stairSum[0] = stairs[0];
        stairSum[1] = stairs[0] + stairs[1];
        stairSum[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);

        for (int i = 3; i < N; i++) {
            stairSum[i] = Math.max(stairSum[i - 3] + stairs[i - 1] + stairs[i], stairSum[i - 2] + stairs[i]);
        }

        bw.write("" + stairSum[N - 1]);
        bw.flush();
        bw.close();
        br.close();

    }

}
