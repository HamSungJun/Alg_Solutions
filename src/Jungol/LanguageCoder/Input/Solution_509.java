package Jungol.LanguageCoder.Input;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_509 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = -100;

        bw.write("" + a);
        bw.flush();
        bw.close();

    }

}
