package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_237 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        String S = st.nextToken();

        StringBuilder sBuf = new StringBuilder();
        sBuf.append(String.format("%d%.3f%s", A, B, S));

        int half = (int) Math.floor((double) sBuf.length() / 2);

        if (sBuf.length() % 2 != 0) {
            bw.write(sBuf.substring(0, half + 1));
            bw.newLine();
            bw.write(sBuf.substring(half + 1, sBuf.length()));
        } else {
            bw.write(sBuf.substring(0, half));
            bw.newLine();
            bw.write(sBuf.substring(half, sBuf.length()));
        }

        bw.flush();
        bw.close();
        br.close();


    }

}
