package Baekjoon.Lev_18;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_11399 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] countArray = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            countArray[Integer.parseInt(st.nextToken())] += 1;
        }

        int waitSum = 0;
        int waitTimeSub = 0;
        for (int i = 1; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                while (countArray[i] > 0) {
                    waitTimeSub += i;
                    waitSum += waitTimeSub;
                    countArray[i] -= 1;
                }
            }
        }

        bw.write("" + waitSum);
        bw.flush();
        bw.close();
        br.close();

    }

}
