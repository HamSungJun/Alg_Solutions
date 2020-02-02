package Baekjoon.Lev_6;

import java.io.*;
import java.util.Arrays;

public class Solution_1546 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        BUF_IN.readLine();
        double[] dataIn = Arrays.stream(BUF_IN.readLine().split(" ")).mapToDouble(Integer::parseInt).toArray();
        double max = dataIn[0];
        for (int i = 1; i < dataIn.length; i++) {

            if (max < dataIn[i]) {
                max = dataIn[i];
            }

        }

        double avg = 0.0;

        for (int i = 0; i < dataIn.length; i++) {

            avg += (dataIn[i] / max) * 100;

        }

        avg /= dataIn.length;

        BUF_OUT.write("" + avg);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
