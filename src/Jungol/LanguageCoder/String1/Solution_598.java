package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_598 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {

            char nextChar = br.readLine().charAt(0);
            int charCode = nextChar;
            if (65 <= charCode && charCode <= 90 || 97 <= charCode && charCode <= 122) {
                bw.write(nextChar + "\n");
            } else if (48 <= charCode && charCode <= 57) {
                bw.write(charCode + "\n");
            } else {
                break;
            }
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
