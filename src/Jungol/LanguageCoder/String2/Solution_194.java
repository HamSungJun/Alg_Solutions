package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_194 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        A = A.concat(B);
        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sBuf.append(A.charAt(i));
        }
        for (int i = N; i < B.length(); i++) {
            sBuf.append(B.charAt(i));
        }

        bw.write(A);
        bw.newLine();
        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
