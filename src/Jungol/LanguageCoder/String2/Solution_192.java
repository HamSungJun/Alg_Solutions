package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution_192 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
