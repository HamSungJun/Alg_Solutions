package Baekjoon.Lev_14;

import java.io.*;

public class Solution_2750 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        int N = Integer.parseInt(br.readLine());
        int[] dataIn = new int[N];
        for (int i = 0; i < N; i++) {
            dataIn[i] = Integer.parseInt(br.readLine());
        }

        Sorter st = new Sorter();
        st.selectionSort(dataIn);
//        st.insertionSort(dataIn);
//        st.bubbleSort(dataIn);
        for (int sortedInt : dataIn) {
            bw.write("" + sortedInt);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}