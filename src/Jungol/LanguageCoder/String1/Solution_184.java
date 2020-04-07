package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_184 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();

        for (int i = 0; i < s1.length(); i++) {

            char nextChar = s1.charAt(i);
            int charCode = nextChar;

            if (65 <= charCode && charCode <= 90) {
                bw.write((char) (charCode + 32) + "");
            } else if (97 <= charCode && charCode <= 122) {
                bw.write(nextChar + "");
            } else if (48 <= charCode && charCode <= 57) {
                bw.write((char) charCode + "");
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
