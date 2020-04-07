package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_216 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        while (true) {
            String nextLine = br.readLine();
            if (nextLine.equals("END")) break;

            bw.write(strrev(nextLine)+"\n");
            bw.flush();

        }

        bw.close();
        br.close();

    }

    public static String strrev(String s) {

        String[] arr = s.split("");

        for (int i = 0; i < (int) Math.floor((double) arr.length / 2); i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return String.join("", arr);

    }

}
