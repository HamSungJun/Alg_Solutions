package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_503 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("My name is Hong Gil Dong.");
        bw.newLine();
        bw.write("I am 13 years old.");
        bw.flush();
        bw.close();

    }

}
