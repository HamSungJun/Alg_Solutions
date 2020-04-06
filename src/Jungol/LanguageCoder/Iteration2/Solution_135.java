package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_135 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        double mulThreeFiveAcc = 0;
        int mulThreeFiveCount = 0;

        for (int i = Math.min(A,B); i <= Math.max(A,B); i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                mulThreeFiveAcc += i;
                mulThreeFiveCount += 1;
            }

        }

        bw.write("sum : " + (int) mulThreeFiveAcc);
        bw.newLine();
        bw.write(String.format("avg : %.1f", (mulThreeFiveAcc / mulThreeFiveCount)));
        bw.flush();
        bw.close();
        br.close();

    }

}
