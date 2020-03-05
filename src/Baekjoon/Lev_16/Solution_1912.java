package Baekjoon.Lev_16;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1912 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long[] dp = new long[N + 1];
        long maxSum = Long.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            int nextInt = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(nextInt, dp[i - 1] + nextInt);
            maxSum = Math.max(maxSum, dp[i]);
        }

        bw.write("" + maxSum);
        bw.flush();
        bw.close();
        br.close();

    }

}
