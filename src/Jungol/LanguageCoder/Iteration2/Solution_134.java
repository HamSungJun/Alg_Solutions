package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_134 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int numEven = 0;
        int numOdd = 0;
        while (st.hasMoreTokens()) {

            int nextInt = Integer.parseInt(st.nextToken());

            if (nextInt % 2 == 0) {
                numEven += 1;
            } else {
                numOdd += 1;
            }

        }

        bw.write("even : " + numEven);
        bw.newLine();
        bw.write("odd : " + numOdd);
        bw.flush();
        bw.close();
        br.close();

    }

}
