package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_589 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        fn(N, 0);
        bw.close();
        br.close();

    }

    public static void fn(int N, int sum) throws IOException {

        if (N == 0) {
            bw.write(sum + "");
            bw.flush();
            return;
        }

        fn(N - 1, sum + N);

    }

}
