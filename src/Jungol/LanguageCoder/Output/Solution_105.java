package Jungol.LanguageCoder.Output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_105 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%15s%15s%15s", "Seoul", "10,312,545", "+91,375"));
        bw.newLine();
        bw.write(String.format("%15s%15s%15s", "Pusan", "3,567,910", "+5,868"));
        bw.newLine();
        bw.write(String.format("%15s%15s%15s", "Incheon", "2,758,296", "+64,888"));
        bw.newLine();
        bw.write(String.format("%15s%15s%15s", "Daegu", "2,511,676", "+17,230"));
        bw.newLine();
        bw.write(String.format("%15s%15s%15s", "Gwangju", "1,454,636", "+29,774"));
        bw.flush();
        bw.close();

    }

}
