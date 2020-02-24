package Baekjoon.Lev_16;

import java.io.*;

public class Solution_1003 {

    static int[][] fiboCounters = new int[41][2];
    static int lastCalculated = 1;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        fiboCounters[0][0] = 1;
        fiboCounters[0][1] = 0;
        fiboCounters[1][0] = 0;
        fiboCounters[1][1] = 1;

        for (int i = 0; i < T; i++) {

            int nextInt = Integer.parseInt(br.readLine());
            if (nextInt > lastCalculated) {
                doMemo(nextInt);
            }
            bw.write(arrayToAnswer(nextInt));

        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static String arrayToAnswer(int index) {

        StringBuilder sBuf = new StringBuilder();
        sBuf.append(fiboCounters[index][0])
                .append(" ")
                .append(fiboCounters[index][1])
                .append("\n");

        return sBuf.toString();

    }

    public static void doMemo(int index) {

        for (int i = lastCalculated + 1; i <= index; i++) {

            fiboCounters[i][0] = fiboCounters[i - 1][0] + fiboCounters[i - 2][0];
            fiboCounters[i][1] = fiboCounters[i - 1][1] + fiboCounters[i - 2][1];

        }

        lastCalculated = index;

    }


}
