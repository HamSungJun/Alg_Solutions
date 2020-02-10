package Baekjoon.Lev_10;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");

        int M = Integer.parseInt(sTokenizer.nextToken());
        int N = Integer.parseInt(sTokenizer.nextToken());

        boolean[] naturalNumbers = new boolean[N - M + 1];
        Arrays.fill(naturalNumbers, true);

        for (int i = 2; i <= Math.ceil(Math.sqrt(N)); i++) {
            if (isPrime(i)) {
                filterWork(i, naturalNumbers, M);
            }
        }

        for (int i = 0; i < naturalNumbers.length; i++) {
            if (naturalNumbers[i]) {
                if (i + M != 1) {
                    BUF_OUT.write("" + (i + M));
                    BUF_OUT.newLine();
                }

            }
        }

        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }

        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;

    }

    public static void filterWork(int i, boolean[] naturalNumbers, int M) {

        for (int j = 0; j < naturalNumbers.length; j++) {
            if ((j + M) > i && (j + M) % i == 0) {
                naturalNumbers[j] = false;
            }
        }

    }

}
