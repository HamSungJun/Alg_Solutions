package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_104 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("kor 90");
        bw.newLine();
        bw.write("mat 80");
        bw.newLine();
        bw.write("eng 100");
        bw.newLine();
        bw.write("sum 270");
        bw.newLine();
        bw.write("avg 90");
        bw.flush();
        bw.close();

    }

}
