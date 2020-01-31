package Baekjoon.Lev_2;

import java.io.*;

public class Solution_9498 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        String dataIn = BUF_IN.readLine();
        String answer = "";
        int A = Integer.parseInt(dataIn);

        if (90 <= A && A <= 100) {
            answer = "A";
        } else if (80 <= A && A <= 89) {
            answer = "B";
        } else if (70 <= A && A <= 79) {
            answer = "C";
        } else if (60 <= A && A <= 69) {
            answer = "D";
        } else {
            answer = "F";
        }

        BUF_OUT.write(answer);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
