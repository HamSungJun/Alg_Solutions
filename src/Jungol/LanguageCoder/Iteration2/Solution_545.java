package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_545 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int mulThree = 0;
        int mulFive = 0;
        while (st.hasMoreTokens()) {

            int nextInt = Integer.parseInt(st.nextToken());

            if (nextInt % 3 == 0 && nextInt != 0) mulThree += 1;
            if (nextInt % 5 == 0 && nextInt != 0) mulFive += 1;

        }

        bw.write("Multiples of 3 : " + mulThree);
        bw.newLine();
        bw.write("Multiples of 5 : " + mulFive);
        bw.flush();
        bw.close();
        br.close();

    }

}
