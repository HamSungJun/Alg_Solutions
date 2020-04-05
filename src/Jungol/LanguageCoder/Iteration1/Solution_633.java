package Jungol.LanguageCoder.Iteration1;

import java.io.*;

public class Solution_633 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            bw.write("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
            bw.flush();

            int selection = Integer.parseInt(br.readLine());
            bw.newLine();
            switch (selection) {
                case 1:
                    bw.write("Seoul");
                    break;
                case 2:
                    bw.write("Washington");
                    break;
                case 3:
                    bw.write("Tokyo");
                    break;
                case 4:
                    bw.write("Beijing");
                    break;
                default:
                    bw.write("none");
                    break;
            }
            bw.write("\n\n");
            bw.flush();

            if (!(1 <= selection && selection <= 4)) {
                break;
            }

        }

        bw.close();
        br.close();

    }

}
