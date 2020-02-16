package Baekjoon.Lev_13;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1018 {

    public static final String[] startW = {"WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"};
    public static final String[] startB = {"BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB"};

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        int boardHeight = Integer.parseInt(tokenizer.nextToken());
        int boardWidth = Integer.parseInt(tokenizer.nextToken());

        String board[] = new String[boardHeight];
        for (int i = 0; i < boardHeight; i++) {
            board[i] = br.readLine();
        }

        int min = 2500;
        for (int xPos = 0; xPos <= boardWidth - 8; xPos++) {
            for (int yPos = 0; yPos <= boardHeight - 8; yPos++) {
                int findResult = find(board, xPos, yPos);
                if (min > findResult) {
                    min = findResult;
                }
            }
        }

        bw.write("" + min);
        bw.flush();
        bw.close();
        br.close();

    }

    public static int find(String[] board, int xPos, int yPos) {

        int accStartW = 0;
        int accStartB = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (startW[i].charAt(j) != board[yPos + i].charAt(xPos + j)) {
                    accStartW += 1;
                }
                if (startB[i].charAt(j) != board[yPos + i].charAt(xPos + j)) {
                    accStartB += 1;
                }
            }
        }

        return Math.min(accStartW, accStartB);

    }

    ;

}
