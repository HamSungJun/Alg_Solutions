package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_574 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        bw.write(getMaxInput(st));
        bw.flush();
        bw.close();
        br.close();

    }

    public static String getMaxInput(StringTokenizer st) {

        int max = Integer.MIN_VALUE;
        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (max < nextInt) {
                max = nextInt;
            }
        }
        return max + "";

    }

}
