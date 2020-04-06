package Jungol.LanguageCoder.Array2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Solution_570 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (i == 0) {
                    arr[i][j] = 1;
                } else {
                    if (j == 0) {
                        arr[i][j] = arr[i - 1][j];
                    } else {
                        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
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
