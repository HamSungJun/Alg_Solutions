package Jungol.LanguageCoder.String1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_182 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        char c1 = st.nextToken().charAt(0);
        char c2 = st.nextToken().charAt(0);

        bw.write(Math.abs(c1 + c2) + " " + Math.abs(c1 - c2));
        bw.flush();
        bw.close();
        br.close();

    }

}
