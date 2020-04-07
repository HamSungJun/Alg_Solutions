package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_606 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();
        s1 = s1.concat("fighting");

        bw.write(s1);
        bw.flush();
        bw.close();
        br.close();

    }

}
