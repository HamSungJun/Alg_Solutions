package Baekjoon.Lev_9;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");
        int[] dataIn = new int[3];
        int pointer = 0;
        while (sTokenizer.hasMoreTokens()) {
            dataIn[pointer++] = Integer.parseInt(sTokenizer.nextToken());
        }

        pointer = (dataIn[2] - dataIn[0]) / (dataIn[0] - dataIn[1]);
        pointer = (dataIn[2] - dataIn[0]) % (dataIn[0] - dataIn[1]) == 0 ? pointer : pointer + 1;

        BUF_OUT.write("" + (1 + pointer));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
