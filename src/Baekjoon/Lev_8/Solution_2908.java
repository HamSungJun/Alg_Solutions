package Baekjoon.Lev_8;

import java.io.*;

public class Solution_2908 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String[] dataIn = BUF_IN.readLine().split(" ");

        int reversedOne = reverse(dataIn[0]);
        int reversedTwo = reverse(dataIn[1]);

        BUF_OUT.write(reversedOne > reversedTwo ? "" + reversedOne : "" + reversedTwo);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static int reverse(String s) {

        StringBuilder sBuf = new StringBuilder(s);
        return Integer.parseInt(sBuf.reverse().toString());

    }

}
