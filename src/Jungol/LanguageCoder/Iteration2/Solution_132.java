package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_132 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextInt = Integer.parseInt(br.readLine().trim());
        int fiveAcc = 0;
        for (int i = 0; i <= nextInt; i += 5) {
            if (i % 5 == 0) fiveAcc += i;
        }

        bw.write("" + fiveAcc);
        bw.flush();
        bw.close();
        br.close();

    }

}
