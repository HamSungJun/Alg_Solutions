package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_601 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();
        String[] sArr = s1.split("");

        for (int i = 0; i < s1.length(); i++) {
            String temp = sArr[sArr.length - 1];
            for (int j = sArr.length - 2; j >= 0; j--) {
                sArr[j + 1] = sArr[j];
            }
            sArr[0] = temp;
            bw.write(String.join("", sArr));
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
