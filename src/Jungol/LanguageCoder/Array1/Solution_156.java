package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_156 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (nextInt == 999) break;

            if (min > nextInt) min = nextInt;
            if (max < nextInt) max = nextInt;
        }

        bw.write("max : " + max);
        bw.newLine();
        bw.write("min : " + min);
        bw.flush();
        bw.close();
        br.close();

    }

}
