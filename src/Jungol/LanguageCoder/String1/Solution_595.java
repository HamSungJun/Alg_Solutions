package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_595 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String name = "Hong Gil Dong";

        for (int i = 3; i <= 6; i++) {
            bw.write(name.charAt(i));
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
