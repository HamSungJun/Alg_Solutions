package Jungol.LanguageCoder.Input;

import java.io.*;

public class Solution_110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("yard? ");
        bw.flush();

        double yard = 91.44;
        double yardIn = Double.parseDouble(br.readLine());

        bw.write(String.format("%.1fyard = %.1fcm", yardIn, yardIn * yard));
        bw.flush();
        bw.close();

    }

}
