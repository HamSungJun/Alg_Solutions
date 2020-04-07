package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_591 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        bw.write(fn(N) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int fn(int N) {

        if (N == 1) {
            return 1;
        }

        return fn(N / 2) + fn(N - 1);

    }

}
