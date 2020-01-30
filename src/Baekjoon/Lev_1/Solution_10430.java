package Baekjoon.Lev_1;

import java.io.*;

public class Solution_10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] dataIn = BUF_IN.readLine().split(" ");

        int A = Integer.parseInt(dataIn[0]);
        int B = Integer.parseInt(dataIn[1]);
        int C = Integer.parseInt(dataIn[2]);

        int resultOne = (A+B)%C;
        int resultTwo = (A*B)%C;

        BUF_OUT.write(""+resultOne+"\n");
        BUF_OUT.write(""+resultOne+"\n");
        BUF_OUT.write(""+resultTwo+"\n");
        BUF_OUT.write(""+resultTwo);

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
