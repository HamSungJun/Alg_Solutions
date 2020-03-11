package Baekjoon.Lev_19;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_11051 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[][] dp = new long[N + 1][K + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
            if (1 <= i && i <= K) {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
            }
        }

        bw.write("" + (dp[N][K] % 10007));
        bw.flush();
        bw.close();
        br.close();

    }

}
