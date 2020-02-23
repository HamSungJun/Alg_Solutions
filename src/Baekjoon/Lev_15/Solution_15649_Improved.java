package Baekjoon.Lev_15;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_15649_Improved {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N + 1];
        int[] basket = new int[M];
        backTrack(visited, basket, 0);
        bw.flush();
        bw.close();

    }

    public static void backTrack(boolean[] visited, int[] basket, int currIdx) {

        if (currIdx == M) {

            printArray(basket);
            return;

        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                basket[currIdx] = i;
                backTrack(visited, basket, currIdx + 1);
                visited[i] = false;
            }
        }

    }

    public static void printArray(int[] basket) {

        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < basket.length; i++) {
            sBuf.append(basket[i]).append(" ");
        }
        sBuf.append("\n");
        try {
            bw.write(sBuf.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
