package JongManBook.BruteForce;

import java.io.*;

public class BOGGLE {

    static char[][] map = new char[5][5];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {

            // 맵 초기화
            for (int i = 0; i < 5; i++) {
                String nextString = br.readLine().trim();
                for (int j = 0; j < 5; j++) {
                    map[i][j] = nextString.charAt(j);
                }
            }

            int C = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < C; i++) {

                String nextFind = br.readLine().trim();
                boolean isFound = false;

                for (int j = 0; j < map.length; j++) {
                    for (int k = 0; k < map.length; k++) {
                        if (isWordExist(nextFind, j, k)) {
                            isFound = true;
                            break;
                        }
                    }
                }

                bw.write(nextFind + (isFound ? " YES" : " NO"));
                bw.newLine();
            }

            bw.flush();

        }

        bw.close();
        br.close();

    }

    public static boolean isWordExist(String nextFind, int row, int col) {

        if (!(0 <= row && row <= 4) || !(0 <= col && col <= 4)) {
            return false;
        }

        if (map[row][col] != nextFind.charAt(0)) {
            return false;
        }

        if (nextFind.length() == 1) {
            return true;
        }

        int[] dx = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = new int[]{-1, -1, 0, 1, 1, 1, 0, -1};

        for (int i = 0; i < 8; i++) {

            int nextRow = row + dy[i];
            int nextCol = col + dx[i];
            if (isWordExist(nextFind.substring(1), nextRow, nextCol)) {
                return true;
            }

        }

        return false;

    }

}
