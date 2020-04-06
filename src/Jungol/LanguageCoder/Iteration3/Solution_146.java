package Jungol.LanguageCoder.Iteration3;

import java.io.*;

public class Solution_146 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ascii_A = 65;
        int acc = 0;

        for (int i = 1; i <= N; i++) {

            for (int j = N; j >= i; j--) {
                bw.write(((char) ascii_A++) + " ");
            }

            for (int j = 1; j < i; j++) {
                bw.write((acc++) + " ");
            }

            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
