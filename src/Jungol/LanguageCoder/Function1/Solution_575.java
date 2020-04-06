package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_575 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(pow(a, b));
        bw.flush();
        bw.close();
        br.close();

    }

    public static String pow(int a, int b) {
        return ((int) Math.pow(a, b)) + "";
    }

}
