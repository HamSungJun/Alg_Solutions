package Baekjoon.Lev_8;

import java.io.*;

public class Solution_5622 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        char[] dataIn = BUF_IN.readLine().toCharArray();

        int[] dialMap = new int[26];
        int duration = 3;
        int mapCounter = 0;

        for (int i = 0; i < dialMap.length; i++) {

            dialMap[i] = duration;
            mapCounter++;

            if (0 <= i && i <= 14 || 19 <= i && i <= 21) {
                if (mapCounter != 0 && mapCounter % 3 == 0) {
                    mapCounter = 0;
                    duration++;
                }
            } else {
                if (mapCounter != 0 && mapCounter % 4 == 0) {
                    mapCounter = 0;
                    duration++;
                }
            }

        }

        int acc = 0;
        for (char c : dataIn) {

            acc += dialMap[(int) c - 65];

        }

        BUF_OUT.write("" + acc);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
