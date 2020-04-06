package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_136 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextInt = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            bw.write((nextInt * i)+" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
