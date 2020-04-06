package Jungol.LanguageCoder.Iteration2;

import java.io.*;

public class Solution_130 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nextInt = Integer.parseInt(br.readLine());

        while (nextInt-- > 0) {
            bw.write("JUNGOL\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }

}
