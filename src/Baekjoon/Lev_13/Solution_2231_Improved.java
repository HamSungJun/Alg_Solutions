package Baekjoon.Lev_13;

import java.io.*;

public class Solution_2231_Improved {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataIn = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = dataIn - 1; i >= 1; i--) {

            int partSum = i;
            int temp = i;
            while (temp > 0) {
                partSum += temp % 10;
                temp /= 10;
            }

            if (partSum == dataIn) {
                answer = i;
            }

        }

        bw.write("" + answer);
        bw.flush();
        bw.close();
        br.close();

    }

}
