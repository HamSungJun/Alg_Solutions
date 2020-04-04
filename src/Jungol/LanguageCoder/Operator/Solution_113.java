package Jungol.LanguageCoder.Operator;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_113 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int width = Integer.parseInt(st.nextToken()) + 5;
        int length = Integer.parseInt(st.nextToken()) * 2;

        bw.write("width = " + width);
        bw.newLine();
        bw.write("length = " + length);
        bw.newLine();
        bw.write("area = " + (width * length));
        bw.flush();
        bw.close();
        br.close();


    }

}
