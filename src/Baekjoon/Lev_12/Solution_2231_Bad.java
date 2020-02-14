package Baekjoon.Lev_12;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution_2231_Bad {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataIn = Integer.parseInt(br.readLine());
        int start = 1;

        while (maxPartitionSumAtDigitLength((start)) < dataIn) {
            start += 1;
        }

        start = (int) Math.pow(10, start - 1);

        while (start <= dataIn) {
            if (getPartitionSum(start) == dataIn) {
                break;
            }
            if (start == dataIn) {
                start = 0;
                break;
            }
            start++;
        }

        bw.write("" + start);
        bw.flush();
        bw.close();

    }

    public static int getPartitionSum(int num) {

        return num + Arrays.stream(("" + num).split("")).mapToInt(Integer::parseInt).reduce(0, (acc, curr) -> acc += curr);

    }

    public static int maxPartitionSumAtDigitLength(int digitLength) {

        return Integer.parseInt(String.join("", Collections.nCopies(digitLength, "9"))) + (9 * digitLength);

    }

}
