package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_190 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[]{"flower", "rose", "lily", "daffodil", "azalea"};

        int matchCount = 0;
        char target = br.readLine().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(1) == target || arr[i].charAt(2) == target) {
                bw.write(arr[i] + "\n");
                matchCount += 1;
            }
        }

        bw.write(matchCount + "");
        bw.flush();
        bw.close();
        br.close();

    }

}
