package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        doWork(arr);

        bw.write(arr[0] + " " + arr[1]);
        bw.flush();
        bw.close();
        br.close();

    }

    public static void doWork(int[] arr) {

        if (arr[1] > arr[0]) {
            arr[1] /= 2;
            arr[0] *= 2;
        } else {
            arr[0] /= 2;
            arr[1] *= 2;
        }

    }

}
