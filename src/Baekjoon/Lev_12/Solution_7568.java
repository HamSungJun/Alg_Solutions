package Baekjoon.Lev_12;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_7568 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] weights = new int[N];
        int[] heights = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            weights[i] = Integer.parseInt(tokenizer.nextToken());
            heights[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    if (weights[i] < weights[j] && heights[i] < heights[j]) {
                        rank += 1;
                    }
                }
            }
            bw.write("" + rank + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
