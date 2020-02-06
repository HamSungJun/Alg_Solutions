package Baekjoon.Lev_9;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");

        long[] dataIn = new long[3];
        long labtopSold = 1;
        int pointer = 0;

        while (sTokenizer.hasMoreTokens()) {
            dataIn[pointer++] = Long.parseLong(sTokenizer.nextToken());
        }

        if (dataIn[1] >= dataIn[2]) {
            labtopSold = -1;
        } else {
            while ((dataIn[0] + dataIn[1] * labtopSold) >= dataIn[2] * labtopSold) {
                labtopSold++;
            }
        }

        BUF_OUT.write("" + labtopSold);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
