package Baekjoon.Lev_10;

import java.io.*;

public class Solution_3053 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int dataIn = Integer.parseInt(BUF_IN.readLine());

        BUF_OUT.write(String.format("%.6f", Math.PI * Math.pow(dataIn, 2)));
        BUF_OUT.newLine();
        BUF_OUT.write(String.format("%.6f", 2 * Math.pow(dataIn, 2)));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
