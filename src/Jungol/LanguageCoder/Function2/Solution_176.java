package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_176 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        int acc = 0;
        for (int i = (int) Math.ceil(Math.sqrt(Math.min(A, B))); i <= (int) Math.floor(Math.sqrt(Math.max(A, B))); i++) {
            acc += 1;
        }

        bw.write(acc + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
