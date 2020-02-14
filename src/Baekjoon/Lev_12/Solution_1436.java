package Baekjoon.Lev_12;

import java.io.*;

public class Solution_1436 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataIn = Integer.parseInt(br.readLine());
        int counter = 0;
        int index = 0;
        while (counter != dataIn) {
            if (String.valueOf(++index).contains("666")) counter++;
        }

        bw.write("" + index);
        bw.flush();
        bw.close();
        br.close();

    }


}
