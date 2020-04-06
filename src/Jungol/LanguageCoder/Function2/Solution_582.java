package Jungol.LanguageCoder.Function2;

import java.io.*;

public class Solution_582 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int circleArea = Integer.parseInt(br.readLine());

        bw.write(String.format("%.2f", calcCircleBanG(circleArea)));
        bw.flush();
        bw.close();
        br.close();

    }

    public static double calcCircleBanG(int circleArea) {

        return Math.sqrt(circleArea / 3.14);

    }

}
