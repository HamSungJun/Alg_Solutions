package Baekjoon.Lev_3;

import java.io.*;

public class Solution_2439 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = 1; i <= T; i++) {
            for (int j = T; j >= 1; j--) {
                BUF_OUT.write(j > i ? " " : "*");
            }
            BUF_OUT.write("\n");
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
