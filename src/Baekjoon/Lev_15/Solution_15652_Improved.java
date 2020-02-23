package Baekjoon.Lev_15;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_15652_Improved {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] basket = new int[M];
        backTrack(basket, 0);
        bw.flush();
        bw.close();

    }

    public static void backTrack(int[] basket, int currIdx) {

        if (currIdx == M) {
            if (isNonDescending(basket)) {
                printArray(basket);
            }
            return;
        }

        for (int i = 1; i <= N; i++) {
            basket[currIdx] = i;
            backTrack(basket, currIdx + 1);
        }

    }

    public static boolean isNonDescending(int[] basket) {

        if (basket.length == 1) return true;

        boolean isNonDescending = true;
        for (int i = 1; i < basket.length; i++) {
            if (basket[i - 1] > basket[i]) {
                isNonDescending = false;
                break;
            }
        }
        return isNonDescending;

    }

    public static void printArray(int[] basket) {

        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < basket.length; i++) {
            sBuf.append(basket[i]).append(" ");
        }
        sBuf.append("\n");
        try {
            bw.write(sBuf.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
