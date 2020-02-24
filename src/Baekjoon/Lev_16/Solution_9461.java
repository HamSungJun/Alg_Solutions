package Baekjoon.Lev_16;

import java.io.*;

public class Solution_9461 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] padovan = new long[101];
        padovan[1] = 1;
        padovan[2] = 1;
        padovan[3] = 1;
        for (int i = 4; i <= 100; i++) {
            padovan[i] = padovan[i - 2] + padovan[i - 3];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int nextInt = Integer.parseInt(br.readLine());
            bw.write("" + padovan[nextInt]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
