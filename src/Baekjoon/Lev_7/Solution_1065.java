package Baekjoon.Lev_7;

import java.io.*;

public class Solution_1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int dataIn = Integer.parseInt(BUF_IN.readLine());
        int answer = 0;
        // 1 ~ 99 까지는 항상 한수이다.
        if (dataIn <= 99) {
            answer = dataIn;
        } else {
            // 그 이후부턴 체크
            answer = 99;
            for (int i = 100; i <= dataIn; i++) {

                if (isHanSu(i)) {
                    answer += 1;
                }

            }

        }

        BUF_OUT.write("" + answer);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static boolean isHanSu(int num) {

        int[] numToArr = new int[("" + num).length()];
        for (int i = numToArr.length - 1; i >= 0; i--) {
            numToArr[i] = num % 10;
            num /= 10;
        }

        int initialDiff = numToArr[0] - numToArr[1];
        boolean isAllDiffEqual = true;

        for (int i = 1; i < numToArr.length - 1; i++) {
            if (numToArr[i] - numToArr[i + 1] != initialDiff) {
                isAllDiffEqual = false;
                break;
            }
        }

        return isAllDiffEqual;

    }

}
