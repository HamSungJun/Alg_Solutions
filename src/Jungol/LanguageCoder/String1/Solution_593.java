package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_593 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            bw.write("ASCII code =? ");
            bw.flush();
            int nextInt = Integer.parseInt(br.readLine());
            if (33 <= nextInt && nextInt <= 127) {
                bw.write((char) nextInt);
                bw.newLine();
                bw.flush();
            } else {
                break;
            }
        }

        bw.close();
        br.close();

    }

}
