package Baekjoon.Lev_9;

import java.io.*;

public class Solution_2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 육각 Wrapper Start Number 1 - 7 - 19 - 37 - 61
         * 이들의 계차 6 - 12 - 18 - 24
         */
        int dataIn = Integer.parseInt(BUF_IN.readLine());
        int closest = 1;
        int curr = 1;
        int acc = 6;

        while (curr < dataIn) {
            curr += acc;
            acc += 6;
            closest += 1;
        }

        BUF_OUT.write("" + closest);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
