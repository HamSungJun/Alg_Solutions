package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_151 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[5];
        int acc = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i % 2 == 0) {
                acc += arr[i];
            }
        }

        bw.write("" + acc);
        bw.flush();
        bw.close();
        br.close();

    }

}
