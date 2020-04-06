package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_137 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                bw.write((i*j)+" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
