package Jungol.LanguageCoder.String1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_188 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int p = 1;

        while (st.hasMoreTokens()) {
            bw.write(String.format("%d. %s\n", p++, st.nextToken()));
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
