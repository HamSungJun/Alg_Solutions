package Jungol.LanguageCoder.Input;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_512 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 49;
        double b = 0.268300;

        bw.write(String.format("%d * %f = %f", a, b, a * b));
        bw.newLine();
        bw.flush();
        bw.close();

    }

}
