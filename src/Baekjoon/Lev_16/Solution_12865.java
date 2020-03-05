package Baekjoon.Lev_16;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_12865 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N + 1][K + 1];

        int[] W = new int[N + 1];
        int[] V = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            W[i] = Integer.parseInt(st2.nextToken());
            V[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j - W[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }

        bw.write("" + dp[N][K]);
        bw.flush();
        bw.close();
        br.close();

    }

}
