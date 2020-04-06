package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_131 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i = (Math.min(A, B)); i <= (Math.max(A, B)); i++) {
            bw.write(i+" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
