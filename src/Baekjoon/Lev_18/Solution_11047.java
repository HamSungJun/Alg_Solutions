package Baekjoon.Lev_18;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_11047 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int acc = 0;

        int[] coins = new int[N];
        for (int i = coins.length - 1; i >= 0; i--) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < coins.length; i++) {

            if (target == 0) break;
            int div = (target / coins[i]);
            if (div > 0) {
                target -= (div * coins[i]);
                acc += div;
            }

        }

        bw.write("" + acc);
        bw.flush();
        bw.close();
        br.close();

    }

}
