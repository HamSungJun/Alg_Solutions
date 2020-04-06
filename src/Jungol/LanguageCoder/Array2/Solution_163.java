package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_163 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[][]{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};

        int elSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                bw.write(arr[i][j] + " ");
                elSum += arr[i][j];
            }
            bw.newLine();
        }

        bw.write(elSum + "");
        bw.flush();
        bw.close();

    }

}
