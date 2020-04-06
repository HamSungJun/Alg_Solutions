package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_564 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] countArr = new int[26];

        while (st.hasMoreTokens()) {

            int nextCode = (int) st.nextToken().charAt(0);
            if (!(65 <= nextCode && nextCode <= 90)) {
                break;
            } else {
                countArr[nextCode - 65] += 1;
            }

        }

        for (int i = 0; i < countArr.length; i++) {

            if (countArr[i] != 0) {
                bw.write(String.format("%c : %d\n", (char) i + 65, countArr[i]));
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
