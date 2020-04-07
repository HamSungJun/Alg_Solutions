package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_605 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = "Hong Gil Dong";
        String s2 = s1;
        s1 = "123";

        bw.write(s2);
        bw.flush();
        bw.close();
        br.close();

    }

}
