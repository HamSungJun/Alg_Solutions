package Baekjoon.Lev_16;

import java.io.*;

public class Solution_1904 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] answers = new long[N + 1];
        answers[0] = 0;
        answers[1] = 1;
        answers[2] = 2;
        for (int i = 3; i <= N; i++) {
            answers[i] = (answers[i - 1] + answers[i - 2]) % 15746;
        }

        bw.write("" + answers[N]);
        bw.flush();
        bw.close();
        br.close();

    }

}
