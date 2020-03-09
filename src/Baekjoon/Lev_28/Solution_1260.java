package Baekjoon.Lev_28;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1260 {

    static int[][] graph;
    static boolean[] visited;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        while (M-- > 0) {
            StringTokenizer stv = new StringTokenizer(br.readLine(), " ");
            int row = Integer.parseInt(stv.nextToken());
            int col = Integer.parseInt(stv.nextToken());
            graph[row][col] = graph[col][row] = 1;
        }

        DFS(V);
        Arrays.fill(visited, false);
        System.out.println();
        BFS(V);

    }

    public static void DFS(int V) {

        if (visited[V]) return;

        visited[V] = true;
        System.out.print(V + " ");
        for (int i = 1; i <= N; i++) {
            if (graph[V][i] == 1) DFS(i);
        }

    }

    public static void BFS(int V) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {

            int nextV = queue.poll();
            System.out.print(nextV + " ");

            for (int i = 1; i <= N; i++) {
                if (graph[nextV][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }

        }


    }

}


