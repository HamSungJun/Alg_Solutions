package Jungol.LanguageCoder.String1;

import java.io.*;

public class Solution_594 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String nextString = br.readLine();

        bw.write(nextString + nextString);
        bw.flush();
        bw.close();
        br.close();

    }

}
