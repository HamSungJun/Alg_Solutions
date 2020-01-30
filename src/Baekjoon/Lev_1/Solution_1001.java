package Baekjoon.Lev_1;

import java.io.*;

public class Solution_1001 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] dataIn = BUF_IN.readLine().split(" ");

        int subResult = Integer.parseInt(dataIn[0]) - Integer.parseInt(dataIn[1]);
        BUF_OUT.write("" + subResult);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();


    }

}
