package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_191 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] arr = new String[50];
        int acc = 0;
        while (true) {
            String nextString = br.readLine();
            if (nextString.equals("0")) {
                break;
            } else {
                arr[acc++] = nextString;
            }
        }

        bw.write(acc + "\n");
        for (int i = 0; i < arr.length; i += 2) {

            if (arr[i] != null) {
                bw.write(arr[i] + "\n");
            } else {
                break;
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
