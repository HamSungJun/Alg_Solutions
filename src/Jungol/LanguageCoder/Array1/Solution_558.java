package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_558 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[100];
        int pointer = 0;

        while (pointer <= 99) {

            int nextInt = Integer.parseInt(st.nextToken());
            if (nextInt != 0) {
                arr[pointer++] = nextInt;
            } else {
                break;
            }

        }

        for (int i = pointer - 1; i >= 0; i--) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
