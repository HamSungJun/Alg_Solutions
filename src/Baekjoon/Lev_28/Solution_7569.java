package Baekjoon.Lev_28;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_7569 {

    static int[][][] Map;
    static int[] maskRow = new int[]{1, 0, -1, 0, 0, 0};
    static int[] maskCol = new int[]{0, 1, 0, -1, 0, 0};
    static int[] maskZ = new int[]{0, 0, 0, 0, 1, -1};
    static int N;
    static int M;
    static int H;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        Map = new int[H][N][M];
        Queue<int[]> myQueue = new LinkedList<>();
        boolean shouldCheck = false;
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < M; j++) {
                    int nextTomatoState = Integer.parseInt(stm.nextToken());
                    Map[k][i][j] = nextTomatoState;
                    if (nextTomatoState == 0) {
                        shouldCheck = true;
                    } else if (nextTomatoState == 1) {
                        myQueue.add(new int[]{k, i, j});
                    }
                }
            }
        }

        if (shouldCheck) {
            int result = BFS(myQueue, 0);
            for (int k = 0; k < H; k++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (Map[k][i][j] == 0) result = -1;
                    }
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

            for (int i = 0; i < 6; i++) {

                int dRow = maskRow[i];
                int dCol = maskCol[i];
                int dZ = maskZ[i];

                if (nextPos[0] + dZ >= 0 && nextPos[0] + dZ < H && nextPos[1] + dRow >= 0 && nextPos[1] + dRow < N && nextPos[2] + dCol >= 0 && nextPos[2] + dCol < M && Map[nextPos[0] + dZ][nextPos[1] + dRow][nextPos[2] + dCol] == 0) {
                    Map[nextPos[0] + dZ][nextPos[1] + dRow][nextPos[2] + dCol] = 1;
                    myQueue.add(new int[]{nextPos[0] + dZ, nextPos[1] + dRow, nextPos[2] + dCol});
                }

            }

        }

        return BFS(myQueue, day + 1);

    }

}

