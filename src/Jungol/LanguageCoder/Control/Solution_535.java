package Jungol.LanguageCoder.Control;

import java.io.*;

public class Solution_535 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double grade = Double.parseDouble(br.readLine());

        switch ((int) grade) {
            case 4:
                bw.write("scholarship");
                break;
            case 3:
                bw.write("next semester");
                break;
            case 2:
                bw.write("seasonal semester");
                break;
            case 1:
            case 0:
                bw.write("retake");
                break;
            default:
                bw.write("error");
                break;
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
