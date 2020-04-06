package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[10];
        int evenAcc = 0;
        double oddAcc = 0;
        for (int i = 0; i < arr.length; i++) {
            int nextInt = Integer.parseInt(st.nextToken());
            arr[i] = nextInt;
            if ((i + 1) % 2 == 0) {
                evenAcc += nextInt;
            } else {
                oddAcc += nextInt;
            }
        }

        bw.write("sum : " + evenAcc);
        bw.newLine();
        bw.write(String.format("avg : %.1f", oddAcc / 5));
        bw.flush();
        bw.close();
        br.close();

    }

}
