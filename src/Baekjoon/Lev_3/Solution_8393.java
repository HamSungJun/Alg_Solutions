package Baekjoon.Lev_3;

import java.io.*;

public class Solution_8393 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(BUF_IN.readLine());

        BUF_OUT.write("" + ((N * (N + 1)) / 2));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
