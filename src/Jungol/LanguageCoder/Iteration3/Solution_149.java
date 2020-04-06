package Jungol.LanguageCoder.Iteration3;

import java.io.*;

public class Solution_149 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int acc = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                bw.write(acc+" ");
                acc = (acc + 2 >= 10 ? 1 : acc + 2);
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
