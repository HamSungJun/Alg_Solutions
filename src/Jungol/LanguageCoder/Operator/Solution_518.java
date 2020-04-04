package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_518 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int SUM = 0;
        for (int i = 0; i < 3; i++) {
            SUM += Integer.parseInt(st.nextToken());
        }

        int AVG = (SUM / 3);

        bw.write("sum : " + SUM);
        bw.newLine();
        bw.write("avg : " + AVG);
        bw.flush();
        bw.close();
        br.close();

    }

}
