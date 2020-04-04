package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        boolean A = (Integer.parseInt(st.nextToken())) != 0;
        boolean B = (Integer.parseInt(st.nextToken())) != 0;

        bw.write("" + (A && B) + " " + (A || B));
        bw.flush();
        bw.close();
        br.close();

    }

}
