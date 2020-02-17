package Baekjoon.Lev_14;

import java.io.*;
import java.util.Arrays;

public class Solution_1427_Raw_Implemented {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        int[] dataIn = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        mergeSort(0, dataIn.length - 1, dataIn);

        for (int j = 0; j < dataIn.length; j++) {
            bw.write("" + dataIn[j]);
        }
        bw.flush();
        bw.close();
        br.close();

    }

    public static void mergeSort(int left, int right, int[] dataIn) {

        if (left < right) {

            int mid = (right + left) / 2;

            mergeSort(left, mid, dataIn);
            mergeSort(mid + 1, right, dataIn);

            merge(left, mid, right, dataIn);

        }

    }

    public static void merge(int left, int mid, int right, int[] dataIn) {

        int i = left;
        int j = mid + 1;
        int k = left;
        int[] temp = new int[dataIn.length];

        while (i <= mid && j <= right) {
            if (dataIn[i] >= dataIn[j]) {
                temp[k] = dataIn[i];
                i++;
            } else {
                temp[k] = dataIn[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            for (int l = j; l <= right; l++) {
                temp[k++] = dataIn[l];
            }
        } else {
            for (int l = i; l <= mid; l++) {
                temp[k++] = dataIn[l];
            }
        }

        for (int l = left; l <= right; l++) {
            dataIn[l] = temp[l];
        }

    }

}
