package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_565 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] digitCountArr = new int[10];
        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (nextInt == 0) {
                break;
            } else {

                while (nextInt >= 100) {
                    nextInt /= 10;
                }

                digitCountArr[nextInt / 10] += 1;

            }
        }

        for (int i = 0; i < digitCountArr.length; i++) {
            if (digitCountArr[i] != 0) {
                bw.write(String.format("%d : %d\n", i, digitCountArr[i]));
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
