package Baekjoon.Lev_15;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_15649 {

    static StringBuilder sBuf = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N + 1];
        Stack<Integer> basket = new Stack<>();

        backTrack(visited, N, M, 0, basket);

        bw.write(sBuf.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void backTrack(boolean[] visited, int N, int M, int currIdx, Stack<Integer> basket) throws IOException {

        if (currIdx == M) {
            printStack(basket);
            return;
        }

        for (int i = 1; i <= N; i++) {

            if (visited[i]) {
                continue;
            }

            basket.push(i);
            visited[i] = true;
            backTrack(visited, N, M, currIdx + 1, basket);
            visited[i] = false;
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
