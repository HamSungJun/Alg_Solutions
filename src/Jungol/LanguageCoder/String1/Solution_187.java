package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_187 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();
        StringBuilder sBuf = new StringBuilder();
        sBuf.append(s1);

        while (sBuf.length() >= 2) {

            int nextInt = Integer.parseInt(br.readLine());
            sBuf.deleteCharAt((nextInt - 1 >= sBuf.length() ? sBuf.length() - 1 : nextInt - 1));
            bw.write(sBuf.toString());
            bw.newLine();
            bw.flush();

        }

        bw.close();
        br.close();


    }

}
