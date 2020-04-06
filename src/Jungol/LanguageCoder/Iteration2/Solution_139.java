package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_139 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int mulStart = 1;

        for (int i = 1; i <= 9; i++) {
            if (A >= B) {
                for (int j = A; j >= B; j--) {
                    bw.write(String.format("%d * %d =%3d   ", j, mulStart, (j * mulStart)));
                }
            } else {
                for (int j = A; j <= B; j++) {
                    bw.write(String.format("%d * %d =%3d   ", j, mulStart, (j * mulStart)));
                }
            }
            mulStart += 1;
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
