package Baekjoon.Lev_16;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1932 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] triangleIn = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                if (st.hasMoreTokens()) triangleIn[i][j] = Integer.parseInt(st.nextToken());
                else break;
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    triangleIn[i][j] = triangleIn[i - 1][j] + triangleIn[i][j];
                } else if (j == i) {
                    triangleIn[i][j] = triangleIn[i - 1][j - 1] + triangleIn[i][j];
                } else {
                    triangleIn[i][j] = Math.max(triangleIn[i - 1][j - 1] + triangleIn[i][j], triangleIn[i - 1][j] + triangleIn[i][j]);
                }
            }
        }

        bw.write("" + getMaxInArray(triangleIn[N - 1]));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int getMaxInArray(int[] lastRow) {

        int max = lastRow[0];
        for (int i = 1; i < lastRow.length; i++) {
            if (max < lastRow[i]) max = lastRow[i];
        }
        return max;

    }

}
