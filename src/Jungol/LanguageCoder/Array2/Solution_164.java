package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] scores = new int[4][4];
        for (int i = 0; i < 4; i++) {
            bw.write((i + 1) + "class? ");
            bw.flush();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int subAcc = 0;
            for (int j = 0; j < 3; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
                subAcc += scores[i][j];
                if (j == 2) {
                    scores[i][3] = subAcc;
                }
            }
        }

        for (int i = 0; i < scores.length; i++) {
            bw.write(String.format("%dclass : %d\n", i + 1, scores[i][3]));
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
