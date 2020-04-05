package Jungol.LanguageCoder.Iteration1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_127 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double sum = 0;
        double inputCount = 0;
        while (st.hasMoreTokens()) {

            int nextInt = Integer.parseInt(st.nextToken());

            if (!(0 <= nextInt && nextInt <= 100)) {
                break;
            }

            sum += nextInt;
            inputCount += 1;

        }

        bw.write("sum : " + (int) sum);
        bw.newLine();
        bw.write(String.format("avg : %.1f", (sum / inputCount)));
        bw.flush();
        bw.close();
        br.close();

    }

}
