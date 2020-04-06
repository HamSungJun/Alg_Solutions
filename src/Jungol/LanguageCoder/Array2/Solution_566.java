package Jungol.LanguageCoder.Array2;

import java.io.*;

public class Solution_566 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 100;
        int B = Integer.parseInt(br.readLine());

        bw.write(A + " " + B + " ");

        while (true) {
            int nextSub = A - B;
            bw.write(nextSub + " ");
            if (nextSub < 0) break;
            A = B;
            B = nextSub;
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
