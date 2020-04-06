package Jungol.LanguageCoder.Iteration2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_547 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i <= 6; i++) {
            for (int j = i; j <= i + 4; j++) {
                bw.write(j + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}
