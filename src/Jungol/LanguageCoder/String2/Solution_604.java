package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_604 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        char nextChar = br.readLine().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == nextChar) {
                bw.write(arr[i] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
