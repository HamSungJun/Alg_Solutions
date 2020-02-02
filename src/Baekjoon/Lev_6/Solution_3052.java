package Baekjoon.Lev_6;

import java.io.*;
import java.util.Arrays;

public class Solution_3052 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] modValueCounter = new int[42];
        int acc = 0;
        Arrays.fill(modValueCounter, 0);

        for (int i = 0; i < 10; i++) {

            int nextModValue = Integer.parseInt(BUF_IN.readLine()) % 42;
            if (modValueCounter[nextModValue] == 0) {
                modValueCounter[nextModValue] = 1;
                acc++;
            }

        }

        BUF_OUT.write("" + acc);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
