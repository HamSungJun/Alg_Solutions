package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_568 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrix_1 = new int[2][4];
        int[][] matrix_2 = new int[2][4];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            for (int j = 0; j < 4; j++) {
                matrix_1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write("first array\nsecond array\n");
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            for (int j = 0; j < 4; j++) {
                matrix_2[i][j] = Integer.parseInt(st.nextToken());
                matrix_1[i][j] = matrix_1[i][j] * matrix_2[i][j];
                bw.write(matrix_1[i][j] + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
