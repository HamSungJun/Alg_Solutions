package Baekjoon.Lev_19;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_5086 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) break;

            if (B % A == 0) bw.write("factor");
            else if (A % B == 0) bw.write("multiple");
            else bw.write("neither");

            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
