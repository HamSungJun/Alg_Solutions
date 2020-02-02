package Baekjoon.Lev_6;

import java.io.*;

public class Solution_10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());

        String[] dataIn = BUF_IN.readLine().split(" ");
        int min = Integer.parseInt(dataIn[0]);
        int max = Integer.parseInt(dataIn[0]);

        for (int i = 1; i < T; i++) {
            int nextInt = Integer.parseInt(dataIn[i]);
            if (min > nextInt) {
                min = nextInt;
            }
            if (max < nextInt) {
                max = nextInt;
            }
        }

        BUF_OUT.write(String.format("%d %d", min, max));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
