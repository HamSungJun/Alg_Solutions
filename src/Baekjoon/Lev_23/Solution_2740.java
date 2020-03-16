package Baekjoon.Lev_23;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2740 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(stm.nextToken());
            }
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st2.nextToken());
        int C = Integer.parseInt(st2.nextToken());

        int[][] B = new int[R][C];
        for (int i = 0; i < R; i++) {
            StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < C; j++) {
                B[i][j] = Integer.parseInt(stm.nextToken());
            }
        }

        int[][] AB = new int[N][C];

        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < C; j++) {
                for (int k = 0; k < M; k++) {
                    AB[i][j] += A[i][k] * B[k][j];
                }
                sBuf.append(AB[i][j] + " ");
            }
            sBuf.append("\n");
        }

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
