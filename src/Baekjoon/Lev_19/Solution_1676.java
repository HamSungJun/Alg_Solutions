package Baekjoon.Lev_19;

import java.io.*;

public class Solution_1676 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[501];
        dp[0] = dp[1] = dp[2] = dp[3] = dp[4] = 0;
        for (int i = 5; i <= N; i++) {
            if (i % 5 == 0) {
                dp[i] = dp[i - 1] + divPrime(i);
            } else {
                dp[i] = dp[i - 1];
            }
        }

        bw.write("" + dp[N]);
        bw.flush();
        bw.close();
        br.close();

    }

    public static int divPrime(int i) {
        int count5 = 0;
        int K = 2;
        while (i != 1) {
            if (i % K == 0) {
                i /= K;
                if (K == 5) {
                    count5++;
                }
            } else {
                K++;
            }
        }
        return count5;
    }

}
