package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_160 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] countDiceArr = new int[7];

        while (st.hasMoreTokens()){
            int nextInt = Integer.parseInt(st.nextToken());
            countDiceArr[nextInt] += 1;
        }

        for (int i = 1; i < countDiceArr.length; i++) {
            bw.write(i+" : "+countDiceArr[i]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
