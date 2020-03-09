package Baekjoon.Lev_28;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_2606 {

    static int[][] network;
    static boolean[] visited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        network = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        Arrays.fill(visited, false);
        int M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            StringTokenizer stv = new StringTokenizer(br.readLine(), " ");
            int row = Integer.parseInt(stv.nextToken());
            int col = Integer.parseInt(stv.nextToken());
            network[row][col] = network[col][row] = 1;
        }

        DFS(1);
//        BFS(1);
        bw.write("" + countWorm(visited));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void DFS(int V) {

        if (visited[V]) return;

        visited[V] = true;
        for (int i = 1; i <= N; i++) {

            if (network[V][i] == 1) DFS(i);

        }

    }

    public static void BFS(int V) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {

            int nextV = queue.poll();

            for (int i = 1; i <= N; i++) {

                if (network[nextV][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }

            }

        }

    }

    public static int countWorm(boolean[] visited) {
        int acc = 0;
        for (int i = 2; i < visited.length; i++) {
            if (visited[i]) acc += 1;
        }
        return acc;
    }

}
