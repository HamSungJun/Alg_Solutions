package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_608 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();

        bw.write((s1.contains("c") ? "Yes" : "No") + " " + (s1.contains("ab") ? "Yes" : "No"));
        bw.flush();
        bw.close();
        br.close();

    }

}
