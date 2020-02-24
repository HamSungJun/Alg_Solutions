package Baekjoon.Lev_16;

import java.io.*;

public class Solution_1463 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] memo = new int[N + 1];

        memo[1] = 0;
        for (int i = 2; i <= N; i++) {
            memo[i] = memo[i - 1] + 1;
            if (i % 2 == 0) memo[i] = Math.min(memo[i], memo[i / 2] + 1);
            if (i % 3 == 0) memo[i] = Math.min(memo[i], memo[i / 3] + 1);
        }

        bw.write("" + memo[N]);
        bw.flush();
        bw.close();
        br.close();

    }

}
