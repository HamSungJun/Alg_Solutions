package Jungol.LanguageCoder.String1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_596 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        for (int i = s.length() - 1; i >= Math.max(0, s.length() - n); i--) {
            bw.write(s.charAt(i));
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
