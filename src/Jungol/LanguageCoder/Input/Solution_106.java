package Jungol.LanguageCoder.Input;

import java.io.*;

public class Solution_106 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 10;
        int B = 20;
        int C = 30;

        bw.write(String.format("%d + %d = %d", A, B, C));
        bw.flush();
        bw.close();

    }

}
