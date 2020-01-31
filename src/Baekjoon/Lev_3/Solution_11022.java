package Baekjoon.Lev_3;

import java.io.*;

public class Solution_11022 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(BUF_IN.readLine());

        for (int i = 0; i < T; i++) {
            String[] dataIn = BUF_IN.readLine().split(" ");
            int A = Integer.parseInt(dataIn[0]);
            int B = Integer.parseInt(dataIn[1]);
            BUF_OUT.write(String.format("Case #%d: %d + %d = %d\n", (i + 1), A, B, A + B));
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
