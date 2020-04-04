package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int isMaxA = ((A > B) && (A > C)) ? 1 : 0;
        B = ((A == B && B == C)) ? 1 : 0;

        bw.write("" + isMaxA + " " + B);
        bw.flush();
        bw.close();
        br.close();

    }

}
