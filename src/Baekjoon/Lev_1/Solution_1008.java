package Baekjoon.Lev_1;

import java.io.*;

public class Solution_1008 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String[] dataIn = BUF_IN.readLine().split(" ");
        double divResult = (Double.parseDouble(dataIn[0]) / Double.parseDouble(dataIn[1]));
        BUF_OUT.write("" + divResult);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
