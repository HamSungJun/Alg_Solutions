package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_588 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        fn(N);
        bw.close();
        br.close();

    }

    public static void fn(int N) throws IOException {
        if (N == 0) return;
        bw.write(N + " ");
        bw.flush();
        fn(N - 1);
    }

}
