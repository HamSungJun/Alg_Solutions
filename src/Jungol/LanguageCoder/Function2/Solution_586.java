package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_586 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(String.format("(%d - %d) ^ 2 = %d", A, B, (int) Math.pow((A - B), 2)));
        bw.newLine();
        bw.write(String.format("(%d + %d) ^ 3 = %d", A, B, (int) Math.pow((A + B), 3)));
        bw.flush();
        bw.close();
        br.close();

    }

}
