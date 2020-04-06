package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_138 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextInt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= nextInt; i++) {
            for (int j = 1; j <= nextInt; j++) {
                bw.write(String.format("(%d, %d) ",i,j));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
