package Baekjoon.Lev_10;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(BUF_IN.readLine());
        StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");

        int primeAcc = 0;
        while (sTokenizer.hasMoreTokens()) {
            primeAcc += isPrime(Integer.parseInt(sTokenizer.nextToken())) ? 1 : 0;
        }

        BUF_OUT.write("" + primeAcc);
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        boolean answer = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;

    }

}
