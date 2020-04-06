package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_174 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printTotal(br);

    }

    public static void printTotal(BufferedReader br) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] m1 = new int[4][4];
        int[] vAcc = new int[3];
        StringTokenizer st = null;

        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                st = new StringTokenizer(br.readLine(), " ");
            }
            int hAcc = 0;
            for (int j = 0; j < 4; j++) {
                if (i <= 2 && j <= 2) {
                    m1[i][j] = Integer.parseInt(st.nextToken());
                    hAcc += m1[i][j];
                    vAcc[j] += m1[i][j];
                } else if (j == 3 && i < 3) {
                    m1[i][j] = hAcc;
                } else if (j < 3) {
                    m1[i][j] = vAcc[j];
                } else {
                    m1[i][j] = vAcc[0] + vAcc[1] + vAcc[2];
                }

                bw.write(m1[i][j] + " ");

            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
