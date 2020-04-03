package Jungol.LanguageCoder.Input;

import java.io.*;

public class Solution_517 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double A = Double.parseDouble(br.readLine());
        double B = Double.parseDouble(br.readLine());
        double C = Double.parseDouble(br.readLine());

        bw.write(String.format("%.3f\n%.3f\n%.3f", A, B, C));
        bw.close();
        br.close();

    }

}
