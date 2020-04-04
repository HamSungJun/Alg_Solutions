package Jungol.LanguageCoder.Debug;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_118 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 5;
        a += 10;
        bw.write("" + a);
        a = a - 1;

        bw.newLine();
        bw.flush();
        bw.close();

    }

}
