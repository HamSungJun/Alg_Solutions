package Jungol.LanguageCoder.Array2;

import java.io.*;

public class Solution_165 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i == 0) {
                    arr[i][j] = (j % 2 == 0 ? 1 : 0);
                } else {

                    if (j == 0) {
                        arr[i][j] = arr[i - 1][j + 1];
                    } else if (j <= arr.length - 2) {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j + 1];
                    } else {
                        arr[i][j] = arr[i - 1][j - 1];
                    }

                }

                bw.write(arr[i][j] + " ");

            }

            bw.newLine();

        }

        bw.flush();
        bw.close();

    }

}
