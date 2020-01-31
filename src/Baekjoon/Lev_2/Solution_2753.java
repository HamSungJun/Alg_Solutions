package Baekjoon.Lev_2;

import java.io.*;

public class Solution_2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        String dataIn = BUF_IN.readLine();
        String answer = "0";
        int A = Integer.parseInt(dataIn);

        if(((A % 4) == 0 && (A % 100) != 0) || (A % 400) == 0){
            answer = "1";
        }

        BUF_OUT.write(answer);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

}
