package Baekjoon.Lev_3;

import java.io.*;

public class Solution_2742 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = T; i >= 1; i--) {
            BUF_OUT.write("" + i + "\n");
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
