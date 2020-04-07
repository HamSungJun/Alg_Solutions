package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_231 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        fn(N);
        bw.close();
        br.close();

    }

    public static void fn(int N) throws IOException {

        if (N < 1) {
            return;
        }

        fn(N / 2);
        bw.write(N + " ");
        bw.flush();

    }

}
