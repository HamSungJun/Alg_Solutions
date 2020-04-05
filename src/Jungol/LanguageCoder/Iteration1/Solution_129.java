package Jungol.LanguageCoder.Iteration1;

import java.io.*;

public class Solution_129 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            bw.write("Base = ");
            bw.flush();
            double base = Integer.parseInt(br.readLine());
            bw.write("Height = ");
            bw.flush();
            double height = Integer.parseInt(br.readLine());
            bw.write(String.format("Triangle width = %.1f", (base * height / 2)));
            bw.newLine();
            bw.write("Continue? ");
            bw.flush();

            String nextString = br.readLine();
            if (!nextString.toLowerCase().equals("y")) {
                break;
            }

        }

        br.close();
        bw.close();

    }

}
