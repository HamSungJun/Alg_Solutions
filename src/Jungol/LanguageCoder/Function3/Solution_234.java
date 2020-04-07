package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_234 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        bw.write(fn(N) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int fn(int N) {

        int[] dp = new int[N+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i-1] * dp[i-2]) % 100;
        }

        return dp[N];

    }

}
