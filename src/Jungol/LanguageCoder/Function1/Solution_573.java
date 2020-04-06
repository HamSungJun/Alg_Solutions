package Jungol.LanguageCoder.Function1;

import java.io.*;

public class Solution_573 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        printMatrix(N, bw);

        bw.close();
        br.close();

    }

    public static void printMatrix(int N, BufferedWriter bw) throws IOException {

        int acc = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write((acc++) + " ");
            }
            bw.newLine();
        }
        bw.flush();

    }

}
