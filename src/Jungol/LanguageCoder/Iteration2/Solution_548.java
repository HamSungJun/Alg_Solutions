package Jungol.LanguageCoder.Iteration2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_548 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                bw.write(String.format("%d * %d =%3d   ", i, j, (i * j)));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}
