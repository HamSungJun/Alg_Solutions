package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_120 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write("" + (A >= B ? A - B : B - A));
        bw.flush();
        bw.close();
        br.close();

    }

}
