package Jungol.LanguageCoder.Function1;

import java.io.*;

public class Solution_170 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("first\n");
        printGolbang(bw);
        bw.write("second\n");
        printGolbang(bw);
        bw.write("third\n");
        printGolbang(bw);

        bw.flush();
        bw.close();
        br.close();

    }

    public static void printGolbang(BufferedWriter bw) throws IOException {

        bw.write("@@@@@@@@@@\n");

    }

}
