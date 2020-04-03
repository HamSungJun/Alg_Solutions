package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_508 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%10s%10s%10s", "item", "count", "price"));
        bw.newLine();
        bw.write(String.format("%10s%10s%10s", "pen", "20", "100"));
        bw.newLine();
        bw.write(String.format("%10s%10s%10s", "note", "5", "95"));
        bw.newLine();
        bw.write(String.format("%10s%10s%10s", "eraser", "110", "97"));
        bw.flush();
        bw.close();

    }

}
