package Baekjoon.Lev_15;

import java.io.*;

/*
    아 존나 어렵다 진짜.
    1. 체스판의 1행에 1~N 열에 퀸을 놓아본다.
    2. 두번째 시행또한 1~N 열에 놓아보면서 퀸을 놓을 수 있는 자리면 함수를 재귀호출 그렇지 않으면 종료한다.
    3. 놓을 수 있는 조건은 행과 열이 중복되면 안되며 대각선으로 다음에 놓은 퀸이 기존의 어떤 퀸들과도 대각선에 위치하면 안된다.
    4. 서로 잡아먹지 않은 배치로 완성된 경우만 카운트++
 */

public class Solution_9663 {

    static int counter = 0;

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        int N = Integer.parseInt(br.readLine());
        // 인덱스는 행 값은 열
        int[] indexRowValueCol = new int[N + 1];
        NthQueen(indexRowValueCol, 1, N);
        bw.write("" + counter);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void NthQueen(int[] indexRowValueCol, int colPointer, int N) {

        if (colPointer == N + 1) {
            counter += 1;
            return;
        }

        for (int i = 1; i <= N; i++) {
            indexRowValueCol[colPointer] = i;
            if (isPromising(indexRowValueCol, colPointer)) {
                NthQueen(indexRowValueCol, colPointer + 1, N);
            }

        }

    }

    public static boolean isPromising(int[] indexRowValueCol, int colPointer) {

        if (colPointer == 1) return true;

        for (int i = 1; i < colPointer; i++) {
            if (indexRowValueCol[i] == indexRowValueCol[colPointer] || Math.abs(i - colPointer) == Math.abs(indexRowValueCol[i] - indexRowValueCol[colPointer])) {
                return false;
            }
        }

        return true;

    }

}