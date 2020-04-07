package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_215 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = atoi(st.nextToken());
        int B = atoi(st.nextToken());

        bw.write((A * B) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int atoi(String s) {

        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int charCode = s.charAt(i);
            if (48 <= charCode && charCode <= 57) {
                sBuf.append(s.charAt(i));
            } else {
                break;
            }

        }

        return Integer.parseInt(sBuf.toString());

    }

}
