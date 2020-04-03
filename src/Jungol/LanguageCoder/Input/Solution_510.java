package Jungol.LanguageCoder.Input;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_510 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = -1;
        int b = 100;

        bw.write("" + a);
        bw.newLine();
        bw.write("" + b);
        bw.flush();
        bw.close();

    }

}
