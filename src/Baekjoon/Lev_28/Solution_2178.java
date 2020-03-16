package Baekjoon.Lev_28;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_2178 {

    static int[][] Map;
    static boolean[][] Visited;
    static int[] maskRow = new int[]{1, 0, -1, 0};
    static int[] maskCol = new int[]{0, 1, 0, -1};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Map = new int[N + 2][M + 2];
        Visited = new boolean[N + 2][M + 2];

        for (int i = 1; i <= N; i++) {
            String nextLine = br.readLine();
            for (int j = 1; j <= M; j++) {
                Map[i][j] = Integer.parseInt("" + nextLine.charAt(j - 1));
            }
        }

        bw.write("" + BFS(1, 1, 1));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int BFS(int row, int col, int moveCount) {

        int answer = 0;
        Queue<CNode> myQueue = new LinkedList<>();
        myQueue.add(new CNode(row, col, moveCount));

        while (!myQueue.isEmpty()) {

            CNode nextCNode = myQueue.poll();
            Visited[nextCNode.row][nextCNode.col] = true;
            if (nextCNode.row == N && nextCNode.col == M) {
                answer = nextCNode.moveCount;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int dRow = maskRow[i];
                int dCol = maskCol[i];
                if (Map[nextCNode.row + dRow][nextCNode.col + dCol] == 1 && !Visited[nextCNode.row + dRow][nextCNode.col + dCol]) {
                    Visited[nextCNode.row + dRow][nextCNode.col + dCol] = true;
                    myQueue.add(new CNode(nextCNode.row + dRow, nextCNode.col + dCol, nextCNode.moveCount + 1));
                }
            }

        }

        return answer;

    }

}
