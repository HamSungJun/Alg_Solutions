package Baekjoon.Lev_28;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_2667 {

    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int label = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N + 2][N + 2];
        visited = new boolean[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {
            String dataIn = br.readLine();
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt("" + dataIn.charAt(j - 1));
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                if (!visited[i][j] && map[i][j] == 1) {
                    label += 1;
                    BFS(i, j);
                }

            }
        }

        printAnswer(map);

    }

    public static void BFS(int row, int col) {

        Queue<Node> queue = new LinkedList<>();
        visited[row][col] = true;
        map[row][col] = label;
        queue.add(new Node(row, col));

        while (!queue.isEmpty()) {

            Node nextNode = queue.poll();
            map[nextNode.row][nextNode.col] = label;

            if (!visited[nextNode.row - 1][nextNode.col] && map[nextNode.row - 1][nextNode.col] == 1) {
                visited[nextNode.row - 1][nextNode.col] = true;
                queue.add(new Node(nextNode.row - 1, nextNode.col));
            }
            if (!visited[nextNode.row][nextNode.col + 1] && map[nextNode.row][nextNode.col + 1] == 1) {
                visited[nextNode.row][nextNode.col + 1] = true;
                queue.add(new Node(nextNode.row, nextNode.col + 1));
            }
            if (!visited[nextNode.row + 1][nextNode.col] && map[nextNode.row + 1][nextNode.col] == 1) {
                visited[nextNode.row + 1][nextNode.col] = true;
                queue.add(new Node(nextNode.row + 1, nextNode.col));
            }
            if (!visited[nextNode.row][nextNode.col - 1] && map[nextNode.row][nextNode.col - 1] == 1) {
                visited[nextNode.row][nextNode.col - 1] = true;
                queue.add(new Node(nextNode.row, nextNode.col - 1));
            }

        }

    }

    public static void printAnswer(int[][] map) {

        int[] labelCount = new int[label];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] >= 1) {
                    labelCount[map[i][j] - 1] += 1;
                }
            }
        }

        System.out.println(label);
        Arrays.sort(labelCount);
        for (int i = 0; i < labelCount.length; i++) {
            System.out.println(labelCount[i]);
        }

    }

}
