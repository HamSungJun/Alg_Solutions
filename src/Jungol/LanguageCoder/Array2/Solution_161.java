package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_161 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] digitCountArr = new int[11];

        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (nextInt == 0) break;
            if (nextInt == 100) {
                digitCountArr[10] += 1;
            } else {
                digitCountArr[nextInt / 10] += 1;
            }

        }

        for (int i = digitCountArr.length - 1; i >= 0; i--) {
            if (digitCountArr[i] > 0) {
                bw.write((i * 10) + " : " + digitCountArr[i] + " person");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
