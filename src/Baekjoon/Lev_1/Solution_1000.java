package Baekjoon.Lev_1;

import java.io.*;
import java.util.Arrays;

public class Solution_1000 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] dataIn = BUF_IN.readLine().split(" ");

        int addResult = Arrays.stream(dataIn).mapToInt(Integer::parseInt).reduce(0, (acc, curr) -> acc += curr);
        BUF_OUT.write("" + addResult);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
