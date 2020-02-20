package Baekjoon.Lev_15;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_14889 {

    static int N;
    static int minDiff = Integer.MAX_VALUE;
    static int[][] abilityMap;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        N = Integer.parseInt(br.readLine());
        abilityMap = new int[N + 1][N + 1];
        // 능력치맵 세팅
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                abilityMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        selected = new boolean[N + 1];

        backTrack(1, 0);
        bw.write("" + minDiff);
        bw.flush();
        bw.close();

    }

    public static void backTrack(int start, int currIdx) {

        if (currIdx == N / 2) {
            calcAbility();
            return;
        }

        for (int i = start; i <= N; i++) {

            if (!selected[i]) {
                selected[i] = true;
                backTrack(i + 1, currIdx + 1);
                selected[i] = false;
            }

        }

    }

    public static void calcAbility() {

        int sumStart = 0;
        int sumLink = 0;

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {

                if (selected[i] && selected[j])
                    sumStart += abilityMap[i][j];

                if (!selected[i] && !selected[j])
                    sumLink += abilityMap[i][j];
            }
        }

        minDiff = Math.min(minDiff, Math.abs(sumStart - sumLink));

    }

}
