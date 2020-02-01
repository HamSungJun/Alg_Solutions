package Baekjoon.Lev_4;

import java.io.*;
import java.util.Arrays;

public class Solution_10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";

        while ((line = BUF_IN.readLine()) != null) {

            String[] dataIn = line.split(" ");
            BUF_OUT.write("" + (Integer.parseInt(dataIn[0]) + Integer.parseInt(dataIn[1])) + "\n");


        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();


    }

}
