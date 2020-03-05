package Baekjoon.Lev_16;

import java.io.*;

public class Solution_10844 {

    final static int MOD_VALUE = 1000000000;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] stairArray = new long[N + 1][10];

        for (int i = 0; i < 9; i++) {
            stairArray[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) stairArray[i][j] = stairArray[i - 1][1] % MOD_VALUE;
                else if (j == 9) stairArray[i][j] = stairArray[i - 1][8] % MOD_VALUE;
                else stairArray[i][j] = (stairArray[i - 1][j - 1] + stairArray[i - 1][j + 1]) % MOD_VALUE;
            }
        }
        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += stairArray[N][i];
        }

        bw.write("" + (result % MOD_VALUE));

        bw.flush();
        bw.close();

    }


}
