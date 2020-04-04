package Jungol.LanguageCoder.Control;

import java.io.*;

public class Solution_123 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Number? ");
        bw.flush();

        int A = Integer.parseInt(br.readLine());

        switch (A) {
            case 1:
                bw.write("dog");
                break;
            case 2:
                bw.write("cat");
                break;
            case 3:
                bw.write("chick");
                break;
            default:
                bw.write("I don't know.");
                break;
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
