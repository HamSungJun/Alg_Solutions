package Baekjoon.Lev_10;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_4948 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> dataIn = new ArrayList<>();
        int nextInt = 0;
        int maxIn = 0;

        while ((nextInt = Integer.parseInt(BUF_IN.readLine())) != 0) {
            dataIn.add(nextInt);
            if (maxIn < nextInt) {
                maxIn = nextInt;
            }
        }

        Eratosthenes eChe = new Eratosthenes((2 * maxIn) + 1);
        eChe.setChe();

        for (int i = 0; i < dataIn.size(); i++) {
            BUF_OUT.write("" + eChe.countBetween(dataIn.get(i)));
            BUF_OUT.newLine();
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
