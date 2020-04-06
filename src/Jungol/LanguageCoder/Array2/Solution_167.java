package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_167 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] m1 = new int[4][2];

        double totalAcc = 0;
        double hAcc = 0;
        double vAcc1 = 0;
        double vAcc2 = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            hAcc = 0;
            for (int j = 0; j < 2; j++) {
                m1[i][j] = Integer.parseInt(st.nextToken());
                hAcc += m1[i][j];
                if (j == 0) vAcc1 += m1[i][j];
                else vAcc2 += m1[i][j];
                totalAcc += m1[i][j];
            }
            bw.write((int)Math.floor(hAcc / 2) + " ");
        }
        bw.newLine();
        bw.write((int)Math.floor(vAcc1 / 4) + " " + (int)Math.floor(vAcc2 / 4));
        bw.newLine();
        bw.write((int)Math.floor(totalAcc / 8) + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
