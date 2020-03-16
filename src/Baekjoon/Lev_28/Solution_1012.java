package Baekjoon.Lev_28;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1012 {

    static int Label = 0;
    static int[][] Map;
    static boolean[][] Visited;
    static int[] maskCol = new int[]{0,1,0,-1};
    static int[] maskRow = new int[]{-1,0,1,0};

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Map = new int[N+2][M+2];
            Visited = new boolean[N+2][M+2];
            while(K-- > 0){
                StringTokenizer stp = new StringTokenizer(br.readLine(), " ");
                int col = Integer.parseInt(stp.nextToken());
                int row = Integer.parseInt(stp.nextToken());
                Map[row+1][col+1] = 1;
            }

            Label = 0;
            for (int i = 0; i < N+2; i++) {
                for (int j = 0; j < M+2; j++) {
                    if(Map[i][j] == 1 && !Visited[i][j]){
                        Label += 1;
                        BFS(i,j);
                    }
                }
            }

//            for (int i = 0; i < N+2; i++) {
//                System.out.println(Arrays.toString(Map[i]));
//            }

            bw.write(""+Label);
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static void BFS(int row, int col){

        Queue<int[]> myQueue = new LinkedList<>();
        Visited[row][col] = true;
        myQueue.add(new int[]{row,col});


        while(!myQueue.isEmpty()){

            int[] nextPos = myQueue.poll();
            Map[nextPos[0]][nextPos[1]] = Label;

            for (int i = 0; i < 4; i++) {

                int dCol = maskCol[i];
                int dRow = maskRow[i];
                if(Map[nextPos[0]+dRow][nextPos[1]+dCol] == 1 && !Visited[nextPos[0]+dRow][nextPos[1]+dCol]){
                    Visited[nextPos[0]+dRow][nextPos[1]+dCol] = true;
                    myQueue.add(new int[]{nextPos[0]+dRow,nextPos[1]+dCol});
                }

            }

        }

    }

}
