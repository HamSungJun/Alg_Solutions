package Baekjoon.Lev_8;

import java.io.*;
import java.util.Arrays;

public class Solution_1157 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String dataIn = BUF_IN.readLine().toLowerCase();
        int[] charCodeRange = new int[26];
        Arrays.fill(charCodeRange, 0);

        for (char c : dataIn.toCharArray()) {

            int nextCodePoint = (int) c - 97;
            charCodeRange[nextCodePoint] = charCodeRange[nextCodePoint] + 1;

        }

        int max = 0;
        int maxAt = 0;
        for (int i = 0; i < charCodeRange.length; i++) {
            if (max < charCodeRange[i]) {
                max = charCodeRange[i];
                maxAt = i;
            }
        }

        int maxCount = 0;
        for (int i = 0; i < charCodeRange.length; i++) {
            if (max == charCodeRange[i]) {
                maxCount += 1;
            }
        }

        BUF_OUT.write(maxCount > 1 ? "?" : Character.toString((char) (maxAt + 97 - 32)));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();


    }

}
