package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_632 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (A <= B && A <= C) {
            bw.write("" + A);
        } else if (B <= A && B <= C) {
            bw.write("" + B);
        } else {
            bw.write("" + C);
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
