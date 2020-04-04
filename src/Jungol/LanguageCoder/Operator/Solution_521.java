package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_521 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int AB = (A++) * (--B);

        StringBuilder sBuf = new StringBuilder();
        sBuf.append(A).append(" ").append(B).append(" ").append(AB);

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
