package Baekjoon.Lev_3;

import java.io.*;

public class Solution_11021 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = 0; i < T; i++) {
            String[] dataIn = BUF_IN.readLine().split(" ");
            BUF_OUT.write(String.format("Case #%d: %d\n", (i + 1), (Integer.parseInt(dataIn[0]) + Integer.parseInt(dataIn[1]))));
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
