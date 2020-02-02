package Baekjoon.Lev_6;

import java.io.*;
import java.util.Arrays;

public class Solution_4344 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = 0; i < T; i++) {

            double[] dataIn = Arrays.stream(BUF_IN.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            double avg = 0.0;
            for (int j = 1; j < dataIn.length; j++) {
                avg += dataIn[j];
            }
            avg /= (dataIn.length - 1);

            double winnersRate = 0.0;
            for (int j = 1; j < dataIn.length; j++) {
                if (avg < dataIn[j]) {
                    winnersRate += 1.0;
                }
            }

            BUF_OUT.write(String.format("%.3f%s\n", (winnersRate / (dataIn.length - 1)) * 100, "%"));

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
