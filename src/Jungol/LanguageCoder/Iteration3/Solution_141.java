package Jungol.LanguageCoder.Iteration3;

import java.io.*;

public class Solution_141 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int acc = 1;
        while ((N * acc) < 100) {

            int nextMul = N * (acc++);
            bw.write(nextMul + " ");
            if (nextMul % 10 == 0) break;

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
