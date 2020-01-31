package Baekjoon.Lev_3;

import java.io.*;
import java.util.Arrays;

public class Solution_10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] dataIn = BUF_IN.readLine().split(" ");

        int targetNum = Integer.parseInt(dataIn[1]);

        dataIn = BUF_IN.readLine().split(" ");

        Arrays.stream(dataIn).mapToInt(Integer::parseInt).forEach(el -> {
            if (el < targetNum) {
                try {
                    BUF_OUT.write("" + el + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
