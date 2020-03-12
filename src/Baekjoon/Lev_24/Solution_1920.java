package Baekjoon.Lev_24;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1920 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
        while (M-- > 0) {
            int nextTarget = Integer.parseInt(stm.nextToken());
            if (binarySearch(0, arr.length - 1, arr, nextTarget)) {
                bw.write("1");
            } else {
                bw.write("0");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean binarySearch(int low, int high, int[] arr, int target) {

        int mid = (low + high) / 2;
        if (mid > high || mid < low) return false;

        if (arr[mid] == target) return true;
        else {
            if (arr[mid] > target) {
                return binarySearch(low, mid - 1, arr, target);
            } else if (arr[mid] < target) {
                return binarySearch(mid + 1, high, arr, target);
            }
        }

        return false;

    }

}
