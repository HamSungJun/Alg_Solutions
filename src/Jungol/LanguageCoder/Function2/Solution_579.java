package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_579 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sortDesc(arr);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    public static void sortDesc(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int nextMaxIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[nextMaxIdx] < arr[j]){
                    nextMaxIdx = j;
                }
            }
            if(nextMaxIdx != i){
                swap(i, nextMaxIdx, arr);
            }
        }

    }

    public static void swap(int i, int j, int[] arr){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
