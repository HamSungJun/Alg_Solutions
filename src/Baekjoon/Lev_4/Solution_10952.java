package Baekjoon.Lev_4;

import java.io.*;
import java.util.Arrays;

public class Solution_10952 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int[] dataIn = Arrays.stream(BUF_IN.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (dataIn[0] == 0 && dataIn[1] == 0) {
                break;
            }

            BUF_OUT.write("" + (dataIn[0] + dataIn[1]) + "\n");

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();


    }

}
