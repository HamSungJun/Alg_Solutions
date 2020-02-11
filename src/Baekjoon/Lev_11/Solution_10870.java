package Baekjoon.Lev_11;

import java.io.*;

public class Solution_10870 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataIn = Integer.parseInt(br.readLine());

        bw.write(""+fibonacci(dataIn));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int fibonacci(int n){

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

}

