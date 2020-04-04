package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_532 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        if (A >= 4.0 && B >= 4.0) {
            bw.write("A");
        } else if (A >= 3.0 && B >= 3.0) {
            bw.write("B");
        } else {
            bw.write("C");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
