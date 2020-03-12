package Baekjoon.Lev_24;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_10816 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int nextKey = Integer.parseInt(st.nextToken());
            countMap.computeIfPresent(nextKey, (K, V) -> V += 1);
            countMap.putIfAbsent(nextKey, 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
        StringBuilder sBuf = new StringBuilder();
        while (M-- > 0) {

            int nextTarget = Integer.parseInt(stm.nextToken());
            sBuf.append(countMap.getOrDefault(nextTarget, 0) + " ");

        }

        bw.write(sBuf.toString().trim());
        bw.flush();
        bw.close();
        br.close();

    }

}
