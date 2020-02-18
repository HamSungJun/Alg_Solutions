package Baekjoon.Lev_15;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_15651 {

    static StringBuilder sBuf = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Stack<Integer> basket = new Stack<>();

        backTrack(N, M, 0, basket);

        bw.write(sBuf.toString().trim());
        bw.flush();
        bw.close();
        br.close();

    }

    public static void backTrack(int N, int M, int currIdx, Stack<Integer> basket) {

        if (currIdx == M) {
            printStack(basket);
            return;
        }

        for (int i = 1; i <= N; i++) {
            basket.push(i);
            backTrack(N, M, currIdx + 1, basket);
            basket.pop();

        }

    }

    public static void printStack(Stack<Integer> basket) {

        for (int i = 0; i < basket.size(); i++) {

            sBuf.append(basket.get(i)).append(" ");

        }

        sBuf.append("\n");

    }

}
