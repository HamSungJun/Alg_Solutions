package Baekjoon.Lev_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_2580 {

    static boolean isSolved = false;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

    public static void main(String[] args) throws IOException {

        int[][] sdokuPan = new int[9][9];
        List<ZeroPos> zeroPosList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                int nextInt = Integer.parseInt(st.nextToken());
                sdokuPan[i][j] = nextInt;
                if (nextInt == 0) {
                    zeroPosList.add(new ZeroPos(i, j));
                }
            }
        }

        doSdoku(sdokuPan, 0, zeroPosList);

        bw.flush();
        bw.close();
        br.close();

    }

    public static void doSdoku(int[][] sdokuPan, int modCount, List<ZeroPos> zeroPosList) throws IOException {
        if (isSolved) return;

        if (modCount >= zeroPosList.size()) {

            printSdoku(sdokuPan);
            isSolved = true;
            return;

        }

        ZeroPos nextZeroPos = zeroPosList.get(modCount);

        for (int j = 1; j <= 9; j++) {

            if (!checkSdoku(nextZeroPos.x, nextZeroPos.y, j, sdokuPan)) continue;

            sdokuPan[nextZeroPos.x][nextZeroPos.y] = j;
            doSdoku(sdokuPan, modCount + 1, zeroPosList);
            sdokuPan[nextZeroPos.x][nextZeroPos.y] = 0;


        }

    }

    public static boolean checkSdoku(int row, int col, int tryNumber, int[][] sdokuPan) {

        for (int i = 0; i < 9; i++) {
            if (sdokuPan[row][i] == tryNumber) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (sdokuPan[i][col] == tryNumber) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sdokuPan[i][j] == tryNumber) return false;
            }
        }

        return true;

    }

    public static void printSdoku(int[][] sdokuPan) throws IOException {

        StringBuilder sBuf = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sBuf.append(sdokuPan[i][j]);
                if (j != 8) sBuf.append(" ");

            }
            sBuf.append("\n");
        }

        bw.write(sBuf.toString());

    }

}


