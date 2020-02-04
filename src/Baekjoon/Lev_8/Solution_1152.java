package Baekjoon.Lev_8;

import java.io.*;

public class Solution_1152 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String dataIn[] = BUF_IN.readLine().split(" ");

        int wordCounter = 0;
        for (int i = 0; i < dataIn.length; i++) {
            if (dataIn[i].trim().length() > 0) {
                wordCounter += 1;
            }
        }

        BUF_OUT.write("" + wordCounter);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
