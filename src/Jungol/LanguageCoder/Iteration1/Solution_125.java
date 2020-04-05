package Jungol.LanguageCoder.Iteration1;

import java.io.*;

public class Solution_125 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int end = Integer.parseInt(br.readLine().trim());

        for (int i = 1; i <= end; i++) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
