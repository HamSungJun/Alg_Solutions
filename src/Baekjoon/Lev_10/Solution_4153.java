package Baekjoon.Lev_10;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");
            int X = Integer.parseInt(sTokenizer.nextToken());
            int Y = Integer.parseInt(sTokenizer.nextToken());
            int Z = Integer.parseInt(sTokenizer.nextToken());

            if ((X + Y + Z) != 0) {
                BUF_OUT.write(isPita(X, Y, Z));
                BUF_OUT.newLine();
            } else {
                break;
            }

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static String isPita(int X, int Y, int Z) {

        String answer = "wrong";
        int[] dataIn = {X, Y, Z};
        Arrays.sort(dataIn);

        if (Math.pow(dataIn[2], 2) == (Math.pow(dataIn[1], 2) + Math.pow(dataIn[0], 2))) {
            answer = "right";
        }

        return answer;

    }

}
