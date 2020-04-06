package Jungol.LanguageCoder.Array2;

import java.io.*;

public class Solution_168 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] pascal = new int[N][N];

        for (int i = 0; i < N; i++) {

            if (i == 0) {
                pascal[0][0] = 1;
                continue;
            } else if (i == 1) {
                pascal[1][0] = pascal[1][1] = 1;
                continue;
            }

            for (int j = 0; j < N; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else if (j < i) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        for (int i = pascal.length - 1; i >= 0; i--) {
            for (int j = 0; j < pascal[0].length; j++) {
                if (pascal[i][j] != 0) {
                    bw.write(pascal[i][j] + " ");
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
