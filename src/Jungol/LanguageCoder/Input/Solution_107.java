package Jungol.LanguageCoder.Input;

import java.io.*;

public class Solution_107 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double A = 80.5;
        double B = 22.34;

        bw.write(String.format("%10.2f%10.2f%10.2f", A, B, A + B));
        bw.flush();
        bw.close();

    }

}
