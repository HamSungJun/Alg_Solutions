package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_506 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("My height");
        bw.newLine();
        bw.write("170");
        bw.newLine();
        bw.write("My weight");
        bw.newLine();
        bw.write("68.600000");
        bw.flush();
        bw.close();

    }

}
