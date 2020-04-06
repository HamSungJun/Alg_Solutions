package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_166 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] m1 = new int[2][3];
        int[][] m2 = new int[2][3];

        bw.write("first array\nsecond array\n");
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            if (i <= 1) {
                for (int j = 0; j < 3; j++) {
                    m1[i][j] = Integer.parseInt(st.nextToken());
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    m2[i - 2][j] = Integer.parseInt(st.nextToken());
                    m1[i - 2][j] = m2[i - 2][j] * m1[i - 2][j];
                    bw.write(m1[i - 2][j] + " ");
                }
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
