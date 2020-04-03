package Jungol.LanguageCoder.Input;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_109 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int SUM = A + B + C;
        int AVG = (int) Math.floor((double) (SUM / 3));

        StringBuilder sBuf = new StringBuilder();

        sBuf.append("sum = ").append(SUM).append("\n");
        sBuf.append("avg = ").append(AVG);

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();

    }

}
