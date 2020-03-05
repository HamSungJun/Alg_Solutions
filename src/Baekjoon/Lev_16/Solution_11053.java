package Baekjoon.Lev_16;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_11053 {

    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] list = new int[1001];
        for (int i = 1; i <= N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
            int nextMax = 0;
            for (int j = 1; j < i; j++) {
                if (list[i] > list[j]) {
                    nextMax = Math.max(nextMax, dp[j]);
                }
            }
            dp[i] = nextMax + 1;
            result = Math.max(result, dp[i]);
        }

        bw.write("" + result);
        bw.flush();
        bw.close();
        br.close();

    }

}
