package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_235 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        bw.write(fn(N, 0) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int fn(int N, int divCount) {

        if (N == 1) {
            return divCount;
        }

        return fn(N % 2 == 0 ? N / 2 : N / 3, divCount + 1);

    }

}
