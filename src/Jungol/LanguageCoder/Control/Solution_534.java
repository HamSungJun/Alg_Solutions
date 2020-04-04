package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_534 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String grade = st.nextToken();

        switch (grade) {
            case "A":
                bw.write("Excellent");
                break;
            case "B":
                bw.write("Good");
                break;
            case "C":
                bw.write("Usually");
                break;
            case "D":
                bw.write("Effort");
                break;
            case "F":
                bw.write("Failure");
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
