package Jungol.LanguageCoder.Function3;

import java.io.*;

public class Solution_587 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        fn(N, 0);
        bw.close();
        br.close();

    }

    public static void fn(int N, int i) throws IOException {
        if (N == i) return;
        bw.write("recursive\n");
        bw.flush();
        fn(N, i + 1);
    }

}
