package Baekjoon.Lev_19;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_3036 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int nextInt = Integer.parseInt(st.nextToken());
            int nextGcd = gcd(first, nextInt);
            bw.write((first / nextGcd) + "/" + (nextInt / nextGcd));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static int gcd(int a, int b) {

        if (b == 0) return a;
        else return gcd(b, a % b);

    }

}
