package Baekjoon.Lev_10;

import java.io.*;

public class Solution_2581 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(BUF_IN.readLine());
        int N = Integer.parseInt(BUF_IN.readLine());

        int primeAcc = 0;
        int minPrime = N;
        boolean isPrimeExist = false;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                isPrimeExist = true;
                primeAcc += i;
                if (minPrime > i) {
                    minPrime = i;
                }
            }
        }

        if (isPrimeExist) {
            BUF_OUT.write("" + primeAcc);
            BUF_OUT.newLine();
            BUF_OUT.write("" + minPrime);
        } else {
            BUF_OUT.write("" + -1);
        }

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
