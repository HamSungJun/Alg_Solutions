package Baekjoon.Lev_8;

import java.io.*;

public class Solution_11720 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(BUF_IN.readLine());
        String dataIn = BUF_IN.readLine();

        int acc = 0;
        for (int i = 0; i < dataIn.length(); i++) {
            acc += Integer.parseInt("" + dataIn.charAt(i));
        }

        BUF_OUT.write("" + acc);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
