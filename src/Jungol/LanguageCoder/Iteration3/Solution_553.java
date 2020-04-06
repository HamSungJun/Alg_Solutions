package Jungol.LanguageCoder.Iteration3;

import java.io.*;

public class Solution_553 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int ascii_A = 65;
        for (int i = N; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                bw.write("" + (char) ascii_A++);
            }

            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
