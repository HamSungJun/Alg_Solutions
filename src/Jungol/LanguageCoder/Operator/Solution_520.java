package Jungol.LanguageCoder.Operator;

import java.io.*;

public class Solution_520 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numIn = Integer.parseInt(br.readLine());

        bw.write("" + (numIn++));
        bw.newLine();
        bw.write("" + (++numIn));
        bw.flush();
        bw.close();
        br.close();

    }

}
