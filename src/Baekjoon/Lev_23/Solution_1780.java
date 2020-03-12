package Baekjoon.Lev_23;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1780 {

    static int[][] PAPER;
    static int MINUS = 0;
    static int ZERO = 0;
    static int PLUS = 0;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PAPER = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                PAPER[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        nonaTree(0, 0, N);
        bw.write("" + MINUS);
        bw.newLine();
        bw.write("" + ZERO);
        bw.newLine();
        bw.write("" + PLUS);
        bw.flush();
        bw.close();
        br.close();

    }

    public static void nonaTree(int row, int col, int size) {

        int initial = PAPER[row][col];
        boolean isDivide = false;

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {

                if(initial != PAPER[i][j]){
                    isDivide = true;
                    break;
                }

            }
            if(isDivide) break;
        }

        if (isDivide) {

            int oneThird = size / 3;
            int twoThird = oneThird * 2;

            nonaTree(row, col, oneThird);
            nonaTree(row, col + oneThird, oneThird);
            nonaTree(row, col + twoThird, oneThird);

            nonaTree(row + oneThird, col, oneThird);
            nonaTree(row + oneThird, col + oneThird, oneThird);
            nonaTree(row + oneThird, col + twoThird, oneThird);

            nonaTree(row + twoThird, col, oneThird);
            nonaTree(row + twoThird, col + oneThird, oneThird);
            nonaTree(row + twoThird, col + twoThird, oneThird);

        } else {

            if (initial == -1) {
                MINUS += 1;
            } else if (initial == 0) {
                ZERO += 1;
            } else if (initial == 1){
                PLUS += 1;
            }

        }

    }

}
