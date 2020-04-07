package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_189 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = br.readLine().split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(arr[i] + "\n");
            bw.flush();
        }

        bw.close();
        br.close();

    }

}
