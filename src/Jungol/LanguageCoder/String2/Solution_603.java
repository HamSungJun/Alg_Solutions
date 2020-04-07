package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_603 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int p = 0;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (p++ % 2 == 0) {
                bw.write(s + "\n");
            }
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
