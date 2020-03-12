package Baekjoon.Lev_23;

import java.io.*;

public class Solution_1992 {

    static int[][] SCREEN;
    static StringBuilder COMPRESSION = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        SCREEN = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] nextString = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                SCREEN[i][j] = Integer.parseInt(nextString[j]);
            }
        }

        quadTree(0, N, 0, N);
        bw.write(COMPRESSION.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static void quadTree(int rowStart, int rowEnd, int colStart, int colEnd) {

        if (rowStart > rowEnd || colStart > colEnd) return;

        int black_1 = 0;
        int white_0 = 0;
        boolean needDivide = false;
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                if (SCREEN[i][j] == 0) {
                    white_0 += 1;
                } else {
                    black_1 += 1;
                }

                if (white_0 != 0 && black_1 != 0) {
                    needDivide = true;
                }
            }
            if (needDivide) break;
        }

        if (needDivide) {
            COMPRESSION.append("(");
            // top-left
            quadTree(rowStart, (rowStart + rowEnd) / 2, colStart, (colStart + colEnd) / 2);
            // top-right
            quadTree(rowStart, (rowStart + rowEnd) / 2, (colStart + colEnd) / 2, colEnd);
            // bottom-left
            quadTree((rowStart + rowEnd) / 2, rowEnd, colStart, (colStart + colEnd) / 2);
            // bottom-right
            quadTree((rowStart + rowEnd) / 2, rowEnd, (colStart + colEnd) / 2, colEnd);
            COMPRESSION.append(")");
        } else {

            if (black_1 != 0) {
                COMPRESSION.append("1");
            } else {
                COMPRESSION.append("0");
            }

        }

    }

}
