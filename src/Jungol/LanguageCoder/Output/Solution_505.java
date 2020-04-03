package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_505 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("I can program well.");
        bw.newLine();
        bw.write("Dreams come true.");
        bw.flush();
        bw.close();

    }

}
