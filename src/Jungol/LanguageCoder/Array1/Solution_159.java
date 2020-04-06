package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_159 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int nextMaxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[nextMaxIdx] < arr[j]) {
                    nextMaxIdx = j;
                }
            }
            if (nextMaxIdx != i) {
                swap(i, nextMaxIdx, arr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static void swap(int i, int j, int[] arr) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
