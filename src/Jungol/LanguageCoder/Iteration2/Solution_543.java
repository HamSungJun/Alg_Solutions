package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_543 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int end = Integer.parseInt(br.readLine());

        for (int i = 2; i <= end; i += 2) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();

    }

}
