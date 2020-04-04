package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_522 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write((A == B ? "1" : "0"));
        bw.newLine();
        bw.write((A != B ? "1" : "0"));
        bw.flush();
        bw.close();
        br.close();

    }

}
