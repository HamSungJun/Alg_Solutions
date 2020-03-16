package Baekjoon.Lev_28;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1697 {

    static int N;
    static int M;
    static int LIMIT = 100001;
    static boolean[] visited = new boolean[LIMIT];

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bw.write("" + BFS(N, M));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int BFS(int N, int M) {

        if (N == M) return 0;
        Queue<Integer> myQueue = new LinkedList<>();
        int time = 1;
        visited[N] = true;
        myQueue.add(N);

        while (true) {

            int nextSize = myQueue.size();
            for (int i = 0; i < nextSize; i++) {

                int nextPos = myQueue.poll();
                if (nextPos - 1 == M || nextPos + 1 == M || nextPos * 2 == M) {
                    return time;
                } else {

                    if (nextPos > 0 && !visited[nextPos - 1]) {
                        visited[nextPos - 1] = true;
                        myQueue.add(nextPos - 1);
                    }
                    if (!visited[nextPos + 1] && nextPos+1 <= LIMIT-1) {
                        visited[nextPos + 1] = true;
                        myQueue.add(nextPos + 1);
                    }
                    if (nextPos * 2 <= LIMIT-1 && !visited[nextPos * 2]) {
                        visited[nextPos * 2] = true;
                        myQueue.add(nextPos * 2);
                    }

                }

            }

            time++;

        }

    }

}
