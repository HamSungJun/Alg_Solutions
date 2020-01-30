package Baekjoon.Lev_1;

import java.io.*;
import java.util.Arrays;

public class Solution_2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int digitCounter = 0;
        int acc = 0;
        int A = Integer.parseInt(BUF_IN.readLine());
        int[] B = Arrays.stream(BUF_IN.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = B.length - 1; i >= 0; i--) {
            int nextMulValue = (A * B[i]);
            BUF_OUT.write("" + nextMulValue + "\n");
            acc += nextMulValue * (int) Math.pow(10, digitCounter++);
        }

        BUF_OUT.write(""+acc);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
