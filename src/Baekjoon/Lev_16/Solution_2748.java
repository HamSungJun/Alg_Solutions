package Baekjoon.Lev_16;

import java.io.*;

public class Solution_2748 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int NthFibo = Integer.parseInt(br.readLine());

        long[] fibHistory = new long[NthFibo + 1];
        fibHistory[0] = 0;
        fibHistory[1] = 1;

        for (int i = 2; i < fibHistory.length; i++) {

            fibHistory[i] = fibHistory[i - 1] + fibHistory[i - 2];

        }

        bw.write("" + fibHistory[fibHistory.length - 1]);
        bw.flush();
        bw.close();
        br.close();

    }

}
