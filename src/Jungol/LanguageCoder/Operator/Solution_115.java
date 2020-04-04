package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_115 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        A = ((A > C) && (B > D)) ? 1 : 0;

        bw.write("" + A);
        bw.flush();
        bw.close();
        br.close();

    }

}
