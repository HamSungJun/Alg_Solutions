package Baekjoon.Lev_19;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2004 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long two = 0;
        long five = 0;

        for (long i = 2; i <= N; i *= 2) {
            two += N / i;
        }
        for (long i = 2; i <= (N - M); i *= 2) {
            two -= (N - M) / i;
        }
        for (long i = 2; i <= (M); i *= 2) {
            two -= M / i;
        }

        for (long i = 5; i <= N; i *= 5) {
            five += N / i;
        }
        for (long i = 5; i <= (N - M); i *= 5) {
            five -= (N - M) / i;
        }
        for (long i = 5; i <= (M); i *= 5) {
            five -= M / i;
        }


        bw.write("" + Math.min(two, five));
        bw.flush();
        bw.close();
        br.close();

    }

}
