package Jungol.LanguageCoder.Input;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_513 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double yd = 91.44;
        double in = 2.54;

        bw.write(String.format("%4.1fyd = %5.1fcm", 2.1, 2.1 * yd));
        bw.newLine();
        bw.write(String.format("%4.1fin = %5.1fcm", 10.5, 10.5 * in));
        bw.flush();
        bw.close();

    }

}
