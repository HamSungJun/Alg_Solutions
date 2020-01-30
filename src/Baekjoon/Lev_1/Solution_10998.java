package Baekjoon.Lev_1;

import java.io.*;

public class Solution_10998 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String[] dataIn = BUF_IN.readLine().split(" ");
        BUF_OUT.write("" + (Integer.parseInt(dataIn[0]) * Integer.parseInt(dataIn[1])));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
