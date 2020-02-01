package Baekjoon.Lev_4;

import java.io.*;
import java.util.Arrays;

public class Solution_1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int target = Integer.parseInt(BUF_IN.readLine());

        if (target < 10) {
            target = target * 10;
        }

        int startNum = target;
        int nextNum = -1;
        int loopCounter = 0;

        while (true) {
            loopCounter++;
            nextNum = Integer.parseInt(("" + getRightMostNum(startNum)) + ("" + getRightMostNum(getDigitSum(startNum))));
            if(nextNum != target){
                startNum = nextNum;
            } else {
                BUF_OUT.write(""+loopCounter);
                break;
            }

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();


    }

    public static int getDigitSum(int num) {

        return Arrays.stream(("" + num).split("")).mapToInt(Integer::parseInt).reduce(0, (acc, curr) -> acc += curr);

    }

    public static int getRightMostNum(int num) {

        return (num % 10);

    }

}
