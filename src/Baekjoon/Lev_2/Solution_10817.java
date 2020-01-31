package Baekjoon.Lev_2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_10817 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] dataIn = Arrays.stream(BUF_IN.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(dataIn, Comparator.reverseOrder());

        BUF_OUT.write(""+dataIn[1]);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
