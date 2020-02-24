package Baekjoon.Lev_16;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1149 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] colorCosts = new int[T][3];
        int[][] sumColorCosts = new int[T][3];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // Red
            colorCosts[i][0] = Integer.parseInt(st.nextToken());
            // Green
            colorCosts[i][1] = Integer.parseInt(st.nextToken());
            // Blue
            colorCosts[i][2] = Integer.parseInt(st.nextToken());
        }

        sumColorCosts[0][0] = colorCosts[0][0];
        sumColorCosts[0][1] = colorCosts[0][1];
        sumColorCosts[0][2] = colorCosts[0][2];

        for (int i = 1; i < T; i++) {
            sumColorCosts[i][0] = Math.min(sumColorCosts[i - 1][1], sumColorCosts[i - 1][2]) + colorCosts[i][0];
            sumColorCosts[i][1] = Math.min(sumColorCosts[i - 1][0], sumColorCosts[i - 1][2]) + colorCosts[i][1];
            sumColorCosts[i][2] = Math.min(sumColorCosts[i - 1][0], sumColorCosts[i - 1][1]) + colorCosts[i][2];
        }

        int minCost = Math.min(sumColorCosts[T - 1][0], Math.min(sumColorCosts[T - 1][1], sumColorCosts[T - 1][2]));

        bw.write("" + minCost);
        bw.flush();
        bw.close();
        br.close();

    }

}
