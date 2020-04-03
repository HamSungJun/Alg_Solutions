package Jungol.LanguageCoder.Input;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_511 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 55;
        int b = 10;

        bw.write(String.format("%d - %d = %d", a, b, a - b));
        bw.newLine();

        a = 2008;
        b = 1999;

        bw.write(String.format("%d - %d = %d", a, b, a - b));
        bw.flush();
        bw.close();

    }

}
