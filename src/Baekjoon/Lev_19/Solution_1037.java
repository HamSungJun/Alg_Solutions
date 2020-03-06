package Baekjoon.Lev_19;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1037 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int maxFactor = Integer.MIN_VALUE;
        int minFactor = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (maxFactor < nextInt) {
                maxFactor = nextInt;
            }
            if (minFactor > nextInt) {
                minFactor = nextInt;
            }
        }

        bw.write("" + (maxFactor * minFactor));
        bw.flush();
        bw.close();
        br.close();

    }

}
