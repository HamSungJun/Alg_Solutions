package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_544 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextInt = Integer.parseInt(br.readLine());
        int acc = 0;
        for (int i = nextInt; i <= 100; i++) {
            acc += i;
        }

        bw.write("" + acc);
        bw.flush();
        bw.close();
        br.close();

    }

}
