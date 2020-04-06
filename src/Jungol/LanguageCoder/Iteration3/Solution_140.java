package Jungol.LanguageCoder.Iteration3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_140 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double acc = 0;
        int counter = 0;
        while (st.hasMoreTokens()) {

            int nextInt = Integer.parseInt(st.nextToken());

            if (nextInt == 0) break;

            acc += nextInt;
            counter += 1;

        }

        bw.write("" + (int) acc + " " + (int)Math.floor(acc / counter));
        bw.flush();
        bw.close();
        br.close();

    }

}
