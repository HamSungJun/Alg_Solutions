package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_607 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s1 = st.nextToken();
        s1 = (s1.charAt(0) + "") + (s1.charAt(1) + "");

        String s2 = st.nextToken();
        StringBuilder sBuf = new StringBuilder();
        sBuf.append(s2);
        sBuf.delete(0, 2);
        sBuf.insert(0, s1);
        sBuf.append(s1);

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
