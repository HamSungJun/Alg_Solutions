package Baekjoon.Lev_16;

import java.io.*;

public class Solution_2156 {

    static int[] wine = new int[10001];
    static int[] dp = new int[10001];

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1];
        dp[2] = wine[1] + wine[2];

        for (int i = 3; i <= N; i++) {
            int nextMax = Math.max(wine[i] + dp[i - 2], wine[i] + wine[i - 1] + dp[i - 3]);
            nextMax = Math.max(nextMax, dp[i - 1]);
            dp[i] = nextMax;
        }

        bw.write("" + dp[N]);
        bw.flush();
        bw.close();
        br.close();

    }

}
