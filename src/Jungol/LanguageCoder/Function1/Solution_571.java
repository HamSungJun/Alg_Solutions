package Jungol.LanguageCoder.Function1;

import java.io.*;

public class Solution_571 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            printSpecialChar(bw);
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static void printSpecialChar(BufferedWriter bw) throws IOException {

        bw.write("~!@#$^&*()_+|\n");

    }

}
