package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_578 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        printGuGu(A, B, bw);

        bw.close();
        br.close();

    }

    public static void printGuGu(int A, int B, BufferedWriter bw) throws IOException {

        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            bw.write("== " + i + "dan ==\n");
            for (int j = 1; j <= 9; j++) {
                bw.write(String.format("%d * %d =%3d\n", i, j, i * j));
            }
            bw.newLine();
        }
        bw.flush();

    }

}
