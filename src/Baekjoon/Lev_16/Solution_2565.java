package Baekjoon.Lev_16;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2565 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TotalWire = Integer.parseInt(br.readLine());
        int[][] dp = new int[TotalWire][3];

        int maxStable = 1;

        for (int i = 0; i < TotalWire; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            dp[i][0] = Integer.parseInt(st.nextToken());
            dp[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(dp, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < dp.length; i++) {

            dp[i][2] = 1;

            for (int j = 0; j < i; j++) {

                if (dp[i][1] > dp[j][1]) {
                    dp[i][2] = Math.max(dp[i][2], dp[j][2] + 1);
                }

            }

            maxStable = Math.max(maxStable, dp[i][2]);

        }

        bw.write("" + (TotalWire - maxStable));
        bw.flush();
        bw.close();
        br.close();

    }

}
