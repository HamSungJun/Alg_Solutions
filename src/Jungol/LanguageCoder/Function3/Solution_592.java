package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_592 {

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
        if (N == 0) {
            return 0;
        }

        return fn(N / 10) + (int) Math.pow(N % 10, 2);

    }

}
