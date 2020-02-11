package Baekjoon.Lev_11;

import java.io.*;

public class Solution_10872 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataIn = Integer.parseInt(br.readLine());

        bw.write(""+factorial(dataIn));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int factorial(int n){

        if(n == 0 || n == 1){
            return 1;
        }

        return n * factorial(n - 1);

    }

}
