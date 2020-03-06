package Baekjoon.Lev_19;

import java.io.*;

public class Solution_11653 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int primePointer = 2;
        while (N > 1) {
            if (N % primePointer == 0) {
                bw.write("" + primePointer);
                bw.newLine();
                N /= primePointer;
            } else {
                while (N % primePointer != 0) {
                    primePointer++;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
