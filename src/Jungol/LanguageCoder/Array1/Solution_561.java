package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_561 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxLower100 = Integer.MIN_VALUE;
        int minHigher100 = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());

            if (nextInt < 100 && maxLower100 < nextInt) {
                maxLower100 = nextInt;
            } else if (nextInt >= 100 && minHigher100 > nextInt) {
                minHigher100 = nextInt;
            }

        }

        bw.write("" + (maxLower100 == Integer.MIN_VALUE ? 100 : maxLower100));
        bw.write(" " + (minHigher100 == Integer.MAX_VALUE ? 100 : minHigher100));
        bw.flush();
        bw.close();
        br.close();

    }

}
