package Jungol.LanguageCoder.Input;

import java.io.*;

public class Solution_516 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double A = Double.parseDouble(br.readLine());
        double B = Double.parseDouble(br.readLine());
        char C = br.readLine().charAt(0);

        bw.write(String.format("%.2f\n%.2f\n%c", A, B, C));
        bw.close();
        br.close();

    }

}
