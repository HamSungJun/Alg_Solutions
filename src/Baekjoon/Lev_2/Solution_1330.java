package Baekjoon.Lev_2;

import java.io.*;

public class Solution_1330 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dataIn = BUF_IN.readLine().split(" ");
        String answer = "";

        int A = Integer.parseInt(dataIn[0]);
        int B = Integer.parseInt(dataIn[1]);

        if (A < B) {
            answer = "<";
        } else if (A > B) {
            answer = ">";
        } else {
            answer = "==";
        }

        BUF_OUT.write(answer);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
