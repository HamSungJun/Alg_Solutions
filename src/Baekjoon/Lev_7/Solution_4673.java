package Baekjoon.Lev_7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution_4673 {

    public static void main(String[] args) throws IOException {

        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] history = new boolean[10001];
        Arrays.fill(history, false);

        for (int i = 1; i <= 10000; i++) {
            int nextInt = next(i);
            if (nextInt <= 10000) {
                history[nextInt] = true;
            }

        }

        for (int i = 1; i <= 10000; i++) {

            if (!history[i]) {
                BUF_OUT.write("" + i + "\n");
            }

        }

        BUF_OUT.flush();
        BUF_OUT.close();

    }

    public static int next(int num) {

        int nextInt = num;
        while (true) {
            if (num == 0) break;
            nextInt += num % 10;
            num /= 10;
        }
        return nextInt;

    }

}
