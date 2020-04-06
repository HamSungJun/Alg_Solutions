package Jungol.LanguageCoder.Array1;

import java.io.*;

public class Solution_155 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = new char[]{'J', 'U', 'N', 'G', 'O', 'L'};

        char which = br.readLine().charAt(0);
        boolean isMatched = false;
        for (int i = 0; i < arr.length; i++) {
            if (which == arr[i]) {
                bw.write("" + i);
                isMatched = true;
            }
        }

        if (!isMatched) {
            bw.write("none");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
