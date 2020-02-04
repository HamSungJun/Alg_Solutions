package Baekjoon.Lev_8;

import java.io.*;

public class Solution_11654 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String dataIn = BUF_IN.readLine();

        BUF_OUT.write("" + (int) dataIn.charAt(0));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
