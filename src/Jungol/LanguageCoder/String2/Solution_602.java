package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_602 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 4; i >= 0; i--) {
            bw.write(arr[i]);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
