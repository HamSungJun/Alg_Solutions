package Baekjoon.Lev_6;

import java.io.*;

public class Solution_2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;
        int maxAt = 0;
        int readCount = 0;

        while (readCount < 9) {
            int nextInt = Integer.parseInt(BUF_IN.readLine());
            if (max < nextInt) {
                max = nextInt;
                maxAt = ((readCount) + 1);
            }

            readCount++;

        }

        BUF_OUT.write(String.format("%d\n%d", max, maxAt));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
