package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_103 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("TTTTTTTTTT");
        bw.newLine();
        bw.write("TTTTTTTTTT");
        bw.newLine();
        bw.write("    TT    ");
        bw.newLine();
        bw.write("    TT    ");
        bw.newLine();
        bw.write("    TT    ");
        bw.flush();
        bw.close();

    }

}
