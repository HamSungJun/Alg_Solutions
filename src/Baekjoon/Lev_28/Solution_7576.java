package Baekjoon.Lev_28;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_7576 {

    static int[][] Map;
    static int[] maskRow = new int[]{1, 0, -1, 0};
    static int[] maskCol = new int[]{0, 1, 0, -1};
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        Map = new int[N][M];
        Queue<int[]> myQueue = new LinkedList<>();
        boolean shouldCheck = false;
        for (int i = 0; i < N; i++) {
            StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                int nextTomatoState = Integer.parseInt(stm.nextToken());
                Map[i][j] = nextTomatoState;
                if (nextTomatoState == 0) {
                    shouldCheck = true;
                } else if (nextTomatoState == 1) {
                    myQueue.add(new int[]{i, j});
                }
            }
        }
        if (shouldCheck) {
            int result = BFS(myQueue, 0);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (Map[i][j] == 0) result = -1;
                }
            }
            bw.write("" + result);
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static int BFS(Queue<int[]> myQueue, int day) {

        if (myQueue.size() == 0) {
            return day - 1;
        }

        int endSize = myQueue.size();

        while (endSize-- > 0) {

            int[] nextPos = myQueue.poll();

            for (int i = 0; i < 4; i++) {

                int dRow = maskRow[i];
                int dCol = maskCol[i];
                if (nextPos[0] + dRow >= 0 && nextPos[0] + dRow < N && nextPos[1] + dCol >= 0 && nextPos[1] + dCol < M && Map[nextPos[0] + dRow][nextPos[1] + dCol] == 0) {
                    Map[nextPos[0] + dRow][nextPos[1] + dCol] = 1;
                    myQueue.add(new int[]{nextPos[0] + dRow, nextPos[1] + dCol});
                }

            }

        }

        return BFS(myQueue, day + 1);

    }

}
