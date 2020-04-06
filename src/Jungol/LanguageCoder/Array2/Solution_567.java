package Jungol.LanguageCoder.Array2;

import java.io.*;

public class Solution_567 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix = new int[3][5];
        matrix[0] = new int[]{5, 8, 10, 6, 4};
        matrix[1] = new int[]{11, 20, 1, 13, 2};
        matrix[2] = new int[]{7, 9, 14, 22, 3};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                bw.write(String.format("%2d   ", matrix[i][j]));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
