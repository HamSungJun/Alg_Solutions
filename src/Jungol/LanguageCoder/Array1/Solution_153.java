package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int pointer = 0;
        int[] arr = new int[100];

        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (nextInt == -1) {
                break;
            } else {
                arr[pointer] = nextInt;
                pointer++;
            }
        }

        for (int i = (Math.max(pointer - 3, 0)); i <= pointer - 1; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
