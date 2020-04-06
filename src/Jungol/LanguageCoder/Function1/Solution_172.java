package Jungol.LanguageCoder.Function1;

import java.io.*;

public class Solution_172 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        printMatrix(N, bw);

        bw.close();
        br.close();

    }

    public static void printMatrix(int N, BufferedWriter bw) throws IOException {

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                bw.write((i * j) + " ");
            }
            bw.newLine();
        }

        bw.flush();

    }

}
