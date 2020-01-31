package Baekjoon.Lev_3;

import java.io.*;

public class Solution_2739 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        String dataIn = BUF_IN.readLine();
        int N = Integer.parseInt(dataIn);

        for (int i = 1; i <= 9; i++) {
            BUF_OUT.write(String.format("%d * %d = %d\n", N, i, (N * i)));
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
