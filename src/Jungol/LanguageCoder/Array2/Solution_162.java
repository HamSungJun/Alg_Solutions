package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_162 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[10];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());

        bw.write(arr[0] + " ");
        bw.write(arr[1] + " ");
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (arr[i] >= 10) {
                while (arr[i] >= 10) {
                    arr[i] %= 10;
                }
            }
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
