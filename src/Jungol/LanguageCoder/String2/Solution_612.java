package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_612 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sBuf = new StringBuilder();

        while (st.hasMoreTokens()) {
            sBuf.append(st.nextToken());
        }

        StringBuilder sBufSlice = new StringBuilder();
        for (int i = 0; i < sBuf.length(); i++) {
            sBufSlice.append(sBuf.charAt(i));
            if (sBufSlice.length() == 3) {
                bw.write(sBufSlice.toString() + "\n");
                sBufSlice.delete(0, sBufSlice.length());
            } else if (i == sBuf.length() - 1) {
                bw.write(sBufSlice.toString());
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
