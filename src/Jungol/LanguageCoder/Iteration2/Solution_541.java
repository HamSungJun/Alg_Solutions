package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nextString = br.readLine();
        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sBuf.append(nextString);
        }

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();

    }

}
