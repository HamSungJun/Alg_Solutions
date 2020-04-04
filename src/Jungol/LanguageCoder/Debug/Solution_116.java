package Jungol.LanguageCoder.Debug;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_116 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double SUM = 0;
        for (int i = 0; i < 3; i++) {
            SUM += Integer.parseInt(st.nextToken());
        }

        bw.write(String.format("%.1f", (SUM / 3)));
        bw.flush();
        bw.close();
        br.close();

    }

}
