package Jungol.LanguageCoder.String2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution_610 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
