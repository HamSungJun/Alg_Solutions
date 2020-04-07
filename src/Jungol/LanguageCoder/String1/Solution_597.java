package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_597 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();
        String s2 = br.readLine();

        bw.write((s1.length()+s2.length())+"");
        bw.flush();
        bw.close();
        br.close();

    }

}
