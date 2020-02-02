package Baekjoon.Lev_5;

import java.io.*;
import java.util.Arrays;

public class Solution_2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numCounter = new int[10];
        Arrays.fill(numCounter, 0);

        int A = Integer.parseInt(BUF_IN.readLine());
        int B = Integer.parseInt(BUF_IN.readLine());
        int C = Integer.parseInt(BUF_IN.readLine());

        Arrays.stream(("" + (A * B * C)).split("")).forEach(num -> {
            int nextIntStream = Integer.parseInt(num);
            numCounter[nextIntStream] = numCounter[nextIntStream] + 1;
        });

        for (int count : numCounter) {
            BUF_OUT.write("" + count + "\n");
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
