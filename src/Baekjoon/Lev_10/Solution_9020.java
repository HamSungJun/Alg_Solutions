package Baekjoon.Lev_10;

import java.io.*;

public class Solution_9020 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());
        int[] dataIn = new int[T];
        int maxIn = 0;
        for (int i = 0; i < T; i++) {
            int nextInt = Integer.parseInt(BUF_IN.readLine());
            dataIn[i] = nextInt;
            if (maxIn < nextInt) {
                maxIn = nextInt;
            }
        }

        Goldbach gb = new Goldbach(maxIn + 1);
        gb.setChe();

        for (int n : dataIn) {
            int[] partition = gb.findPartition(n);
            BUF_OUT.write(String.format("%d %d", partition[0], partition[1]));
            BUF_OUT.newLine();
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}