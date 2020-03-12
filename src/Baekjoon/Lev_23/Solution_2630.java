package Baekjoon.Lev_23;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2630 {

    static int[][] paper;
    static int blueCount;
    static int whiteCount;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        quadTree(0, N, 0, N);

        bw.write("" + whiteCount);
        bw.newLine();
        bw.write("" + blueCount);
        bw.flush();
        bw.close();
        br.close();

    }

    public static void quadTree(int rowStart, int rowEnd, int colStart, int colEnd) {

        if (rowStart > rowEnd || colStart > colEnd) return;

        int subWhite = 0;
        int subBlue = 0;
        boolean isContinue = false;
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                if (paper[i][j] == 0) {
                    subWhite += 1;
                } else {
                    subBlue += 1;
                }

                if (subWhite != 0 && subBlue != 0) {
                    isContinue = true;
                    break;
                }

            }
        }

        if (isContinue) {

            // top-left
            quadTree(rowStart, (rowStart + rowEnd) / 2, colStart, (colStart + colEnd) / 2);
            // top-right
            quadTree(rowStart, (rowStart + rowEnd) / 2, (colStart + colEnd) / 2, colEnd);
            // bottom-left
            quadTree((rowStart + rowEnd) / 2, rowEnd, colStart, (colStart + colEnd) / 2);
            // bottom-right
            quadTree((rowStart + rowEnd) / 2, rowEnd, (colStart + colEnd) / 2, colEnd);

        } else {
            if (subBlue != 0) {
                blueCount += 1;
            } else {
                whiteCount += 1;
            }
        }


    }


}


