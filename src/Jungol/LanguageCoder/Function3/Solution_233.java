package Jungol.LanguageCoder.Function3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_233 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] basket;
    static int N = 0;
    static int M = 0;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        basket = new int[N];
        DFS(1, 0);
        bw.close();
        br.close();

    }

    public static void DFS(int level, int sum) throws IOException {

        if (level > N) {
            if (sum == M) {
                for (int i = 0; i < basket.length; i++) {
                    bw.write(basket[i] + " ");
                }
                bw.newLine();
                bw.flush();
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {

            basket[level - 1] = i;
            DFS(level + 1, sum + i);
            basket[level - 1] = 0;

        }

    }

}
