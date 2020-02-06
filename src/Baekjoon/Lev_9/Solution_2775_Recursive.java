package Baekjoon.Lev_9;

import java.io.*;

public class Solution_2775_Recursive {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = 0; i < T; i++) {

            int K = Integer.parseInt(BUF_IN.readLine());
            int N = Integer.parseInt(BUF_IN.readLine());

            BUF_OUT.write("" + getPeopleNum(K, N) + "\n");
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static int getPeopleNum(int K, int N) {

        if (K == 0) {
            return N;
        }

        int result = 0;
        if (K > 0) {
            for (int i = 1; i <= N; i++) {
                result += getPeopleNum(K - 1, i);
            }
        }

        return result;

    }

}
