package Baekjoon.Lev_23;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_11401_DP {

    static int MOD_VALUE = 1000000007;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] DP = new int[N + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            DP[i][0] = 1;
            if (i >= 1) {
                DP[0][i] = 0;
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                DP[i][j] = (DP[i - 1][j - 1] + DP[i - 1][j]) % MOD_VALUE;
            }
        }

        bw.write("" + DP[N][K]);
        bw.flush();
        bw.close();
        br.close();

    }

}
