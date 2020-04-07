package Jungol.LanguageCoder.String1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_600 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        bw.write(st.countTokens()+"");
        bw.flush();
        bw.close();
        br.close();

    }

}
