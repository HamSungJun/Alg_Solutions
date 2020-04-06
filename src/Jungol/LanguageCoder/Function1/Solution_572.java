package Jungol.LanguageCoder.Function1;

import java.io.*;

public class Solution_572 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(calcCircleArea(N));
        bw.flush();
        bw.close();
        br.close();

    }

    public static String calcCircleArea(int N) {

        return String.format("%.2f", (N * N * 3.14));

    }

}
