package Baekjoon.Lev_8;

import java.io.*;
import java.util.Arrays;

public class Solution_2675 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(BUF_IN.readLine());

        for (int i = 0; i < N; i++) {
            String[] dataIn = BUF_IN.readLine().split(" ");
            StringBuilder result = new StringBuilder();
            result.append(getRepeatedString(dataIn[1].split(""), Integer.parseInt(dataIn[0])));
            BUF_OUT.write(result.toString()+"\n");
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static String getRepeatedString(String[] s, int n) {

        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < n; j++) {
                sBuf.append(s[i]);
            }
        }
        return sBuf.toString();

    }

}
