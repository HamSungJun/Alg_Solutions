package Jungol.LanguageCoder.Control;

import java.io.*;

public class Solution_122 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());

        if (A % 400 == 0 || (A % 4 == 0 && A % 100 != 0)) {
            bw.write("leap year");
        } else {
            bw.write("common year");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
