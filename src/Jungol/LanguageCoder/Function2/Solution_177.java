package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_177 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int acc = 0;
        while (st.hasMoreTokens()) {
            acc += Math.abs(Integer.parseInt(st.nextToken()));
        }

        bw.write(acc + "");
        bw.flush();
        bw.close();
        br.close();

    }

}
