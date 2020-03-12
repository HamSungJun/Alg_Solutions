package Baekjoon.Lev_24;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_10816_BinarySearch_TimeFail {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] numberIn = new int[N];
        for (int i = 0; i < N; i++) {
            numberIn[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numberIn);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
        StringBuilder sBuf = new StringBuilder();
        while (M-- > 0) {

            int nextTarget = Integer.parseInt(stm.nextToken());
            sBuf.append(binarySearch(0, numberIn.length - 1, numberIn, nextTarget) + " ");

        }

        bw.write(sBuf.toString().trim());
        bw.flush();
        bw.close();
        br.close();

    }

    public static int binarySearch(int low, int high, int[] arr, int nextTarget) {

        int mid = (low + high) / 2;
        if (mid < low || mid > high) return 0;

        if (arr[mid] == nextTarget) {

            return 1 + binarySearch(low, mid - 1, arr, nextTarget) + binarySearch(mid + 1, high, arr, nextTarget);

        } else if (arr[mid] < nextTarget) {
            return binarySearch(mid + 1, high, arr, nextTarget);
        } else if (arr[mid] > nextTarget) {
            return binarySearch(low, mid - 1, arr, nextTarget);
        }

        return 0;

    }

}
