package Jungol.LanguageCoder.String1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_186 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        bw.write(Math.max(s1.length(), s2.length()) + "");
        bw.flush();
        bw.close();
        br.close();

    }

}
