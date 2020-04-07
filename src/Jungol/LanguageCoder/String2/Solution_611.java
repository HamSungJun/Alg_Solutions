package Jungol.LanguageCoder.String2;

import java.io.*;

public class Solution_611 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();

        bw.write((atoi(s1) * 2) + "");
        bw.newLine();
        bw.write(String.format("%.2f", atof(s1)));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int atoi(String s) {

        StringBuilder sBuf = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int charCode = s.charAt(i);
            if (48 <= charCode && charCode <= 57) {
                sBuf.append(s.charAt(i));
            } else {
                break;
            }
        }

        return Integer.parseInt(sBuf.toString());

    }

    public static double atof(String s) {

        StringBuilder sBuf = new StringBuilder();
        boolean isPointOccured = false;
        for (int i = 0; i < s.length(); i++) {
            int charCode = s.charAt(i);
            if (48 <= charCode && charCode <= 57) {
                sBuf.append(s.charAt(i));
            } else if (charCode == 46 && !isPointOccured) {
                isPointOccured = true;
                sBuf.append(s.charAt(i));
            } else {
                break;
            }
        }

        return Double.parseDouble(sBuf.toString());

    }

}
