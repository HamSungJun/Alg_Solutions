package Baekjoon.Lev_10;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1085 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");

        int X = Integer.parseInt(sTokenizer.nextToken());
        int Y = Integer.parseInt(sTokenizer.nextToken());
        int W = Integer.parseInt(sTokenizer.nextToken());
        int Z = Integer.parseInt(sTokenizer.nextToken());

        int minX = Math.min(X, W - X);
        int minY = Math.min(Y, Z - Y);

        int minMove = Math.min(minX, minY);

        BUF_OUT.write("" + minMove);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
