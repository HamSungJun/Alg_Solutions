package Baekjoon.Lev_8;

import java.io.*;

public class Solution_10809 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));

        String dataIn = BUF_IN.readLine();

        for (int i = 97; i <= 122; i++) {

            BUF_OUT.write(""+dataIn.indexOf(i)+" ");

        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
