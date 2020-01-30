package Baekjoon.Lev_1;

import java.io.*;
import java.util.Arrays;

public class Solution_10869 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] dataIn = BUF_IN.readLine().split(" ");
        int[] dataInToInt = Arrays.stream(dataIn).mapToInt(Integer::parseInt).toArray();

        BUF_OUT.write(""+(dataInToInt[0]+dataInToInt[1]+"\n"));
        BUF_OUT.write(""+(dataInToInt[0]-dataInToInt[1]+"\n"));
        BUF_OUT.write(""+(dataInToInt[0]*dataInToInt[1]+"\n"));
        BUF_OUT.write(""+(dataInToInt[0]/dataInToInt[1]+"\n"));
        BUF_OUT.write(""+(dataInToInt[0]%dataInToInt[1]));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
