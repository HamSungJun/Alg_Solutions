package Jungol.LanguageCoder.Iteration2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_542 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 10; i <= 20; i++) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();

    }

}
