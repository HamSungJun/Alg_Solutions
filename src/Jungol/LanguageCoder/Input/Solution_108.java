package Jungol.LanguageCoder.Input;

import java.io.*;

public class Solution_108 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 50;
        double B = 100.12;

        bw.write(String.format("%.2f * %d = %.0f", B, A, A * B));
        bw.flush();
        bw.close();

    }

}