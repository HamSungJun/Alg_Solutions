package Baekjoon.Lev_16;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_11054 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];
        int maxLength = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int nextInt = Integer.parseInt(st.nextToken());
            dp[i][0] = nextInt;
            dp[i][1] = dp[i][2] = 1;
            for (int j = 0; j < i; j++) {
                if (dp[j][0] < dp[i][0]) {
                    dp[i][1] = Math.max(dp[i][1], dp[j][1] + 1);
                }
                if (dp[j][0] > dp[i][0]) {
                    dp[i][2] = Math.max(dp[i][2], dp[j][2] + 1);
                    dp[i][2] = Math.max(dp[i][2], dp[j][1] + 1);
                }
            }
            maxLength = Math.max(maxLength, Math.max(dp[i][1], dp[i][2]));
        }

        bw.write("" + maxLength);
        bw.flush();
        bw.close();
        br.close();

    }

}
