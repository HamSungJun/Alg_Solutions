package Baekjoon.Lev_23;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_10830 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long[][] A = new long[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(stm.nextToken());
            }
        }

        A = pow(A, K);
        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sBuf.append(A[i][j] % 1000 + " ");
            }
            sBuf.append("\n");
        }

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    public static long[][] multiply(long[][] M1, long[][] M2, int N) {

        long[][] answer = new long[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    answer[i][j] += (((M1[i][k] % 1000) * (M2[k][j] % 1000)) % 1000);
                }
            }
        }

        return answer;

    }

    public static long[][] pow(long[][] M, long K) {

        if (K == 1) {
            return M;
        }

        if (K % 2 == 0) {
            long[][] halfM = pow(M, K / 2);
            return multiply(halfM, halfM, halfM.length);
        } else {
            return multiply(M, pow(M, K - 1), M.length);
        }

    }

}
