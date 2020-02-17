package Baekjoon.Lev_14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_2108 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        /*
            index 0 ~ 3999 : -1 ~ -4000
            index 4000 : 0
            index 4001 ~ 8000 : 1 ~ 4000
         */

        int N = Integer.parseInt(br.readLine());

        int[] dataIn = new int[8001];
        int sumDataIn = 0;
        int medianAt = ((int) Math.ceil((double) N / 2.0)) - 1;
        int[] sorted = new int[N];

        for (int i = 0; i < N; i++) {
            int nextInt = Integer.parseInt(br.readLine());
            sumDataIn += nextInt;
            dataIn[mapDataToIndex(nextInt)] += 1;
        }

        int maxOccurCount = toSortedArray(sorted, dataIn);

        System.out.println(maxOccurCount);
        System.out.println(Arrays.toString(sorted));

        // 평균값 출력
        bw.write("" + getAverage(sumDataIn, N));
        bw.newLine();

        // 중앙값 출력
        bw.write("" + sorted[medianAt]);
        bw.newLine();

        // 최빈값 출력
        bw.write("" + getMaxOccurNum(maxOccurCount, dataIn));
        bw.newLine();

        // 범위 출력
        bw.write("" + getMinMaxRange(sorted));

        bw.flush();
        bw.close();
        br.close();

    }

    public static int mapDataToIndex(int nextInt) {

        int nextIdx = 4000;
        if (nextInt > 0) {
            nextIdx = 4000 + nextInt;
        } else if (nextInt < 0) {
            nextIdx = (-1 * nextInt) - 1;
        }
        return nextIdx;

    }

    public static int mapIndexToData(int nextIdx) {

        int nextInt = 0;
        if (0 <= nextIdx && nextIdx <= 3999) {
            nextInt = (nextIdx * (-1)) - 1;
        } else if (4001 <= nextIdx && nextIdx <= 8000) {
            nextInt = nextIdx - 4000;
        }
        return nextInt;

    }

    public static int getAverage(int sum, int dataLength) {

        return (int) Math.round((double) sum / (double) dataLength);

    }

    public static int toSortedArray(int[] sorted, int[] dataIn) {

        int pointer = 0;
        int maxOccurCount = 0;

        for (int i = 3999; i >= 0; i--) {

            if (dataIn[i] > 0) {

                if (maxOccurCount < dataIn[i]) {
                    maxOccurCount = dataIn[i];
                }

                for (int j = 0; j < dataIn[i]; j++) {
                    int nextInt = mapIndexToData(i);
                    sorted[pointer++] = nextInt;
                }

            }

        }

        for (int i = 4000; i <= 8000; i++) {

            if (dataIn[i] > 0) {

                if (maxOccurCount < dataIn[i]) {
                    maxOccurCount = dataIn[i];
                }

                for (int j = 0; j < dataIn[i]; j++) {
                    int nextInt = mapIndexToData(i);
                    sorted[pointer++] = nextInt;
                }

            }

        }

        return maxOccurCount;

    }

    public static int getMinMaxRange(int[] sorted) {

        return Math.abs(sorted[sorted.length - 1] - sorted[0]);

    }

    public static int getMaxOccurNum(int maxOccurCount, int[] dataIn) {

        List<Integer> occurList = new ArrayList<>();

        for (int i = 0; i < dataIn.length; i++) {

            if (dataIn[i] == maxOccurCount) {
                occurList.add(mapIndexToData(i));
            }

        }

        Collections.sort(occurList);
        if (occurList.size() >= 2) {
            return occurList.get(1);
        }

        return occurList.get(0);

    }

}
