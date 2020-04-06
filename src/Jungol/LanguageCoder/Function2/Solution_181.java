package Jungol.LanguageCoder.Function2;

import java.io.*;

public class Solution_181 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final double pi = 3.141592;

    public static void main(String[] args) throws IOException {

        bw.write("radius : ");
        bw.flush();

        double radius = Double.parseDouble(br.readLine());

        bw.write(String.format("area = %.3f",Math.pow(radius,2)*pi));
        bw.flush();
        bw.close();
        br.close();

    }
}
