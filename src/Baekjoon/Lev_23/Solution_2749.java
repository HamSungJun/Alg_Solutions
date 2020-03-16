package Baekjoon.Lev_23;

import java.io.*;

public class Solution_2749 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        int Pisano = 15 * 1000000;

        long[] modPisano = new long[Pisano + 1];
        modPisano[0] = 0;
        modPisano[1] = 1;

        for (int i = 2; i <= N; i++) {

            if (i > Pisano) break;
            modPisano[i] = (modPisano[i - 1] + modPisano[i - 2]) % 1000000;

        }

        if (N >= Pisano) N = N % Pisano;
        bw.write("" + modPisano[(int) N]);
        bw.flush();
        bw.close();
        br.close();

    }

}
