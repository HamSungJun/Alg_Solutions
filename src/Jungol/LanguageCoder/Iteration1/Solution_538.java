package Jungol.LanguageCoder.Iteration1;

import java.io.*;

public class Solution_538 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            bw.write("number? ");
            bw.flush();
            int nextInt = Integer.parseInt(br.readLine());

            if (nextInt > 0) {
                bw.write("positive integer\n");
            } else if (nextInt < 0) {
                bw.write("negative number\n");
            } else {
                break;
            }
            bw.flush();
        }

        bw.close();

    }

}
