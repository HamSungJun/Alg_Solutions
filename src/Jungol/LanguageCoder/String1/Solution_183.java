package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_183 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();

        for (int i = 0; i < Math.min(5, s1.length()); i++) {
            bw.write(s1.charAt(i) + "");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
