package Jungol.LanguageCoder.Array1;

import java.io.*;

public class Solution_556 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
