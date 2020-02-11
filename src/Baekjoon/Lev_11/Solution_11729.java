package Baekjoon.Lev_11;

import java.io.*;

public class Solution_11729 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataIn = Integer.parseInt(br.readLine());
        bw.write("" + ((int) Math.pow(2, dataIn) - 1));
        bw.newLine();
        hanoi(bw, dataIn, 1, 2, 3);
        bw.flush();
        bw.close();
    }

    public static void hanoi(BufferedWriter bw, int n, int start, int mid, int end) throws IOException {

        if (n == 1) {
            bw.write(String.format("%d %d", start, end));
            bw.newLine();
        } else {
            hanoi(bw, n - 1, start, end, mid);
            bw.write(String.format("%d %d", start, end));
            bw.newLine();
            hanoi(bw, n - 1, mid, start, end);
        }
    }

}
