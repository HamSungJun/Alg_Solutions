package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_583 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
        double[] dIn = new double[3];
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        double mid = 0;

        for (int i = 0; i < dIn.length; i++) {

            dIn[i] = Double.parseDouble(st.nextToken());
            if (dIn[i] > max) {
                max = dIn[i];
            }
            if (dIn[i] < min) {
                min = dIn[i];
            }

        }

        for (int i = 0; i < dIn.length; i++) {
            if (dIn[i] != min && dIn[i] != max) {
                mid = dIn[i];
            }
        }

        bw.write( (int)Math.ceil(max) + " " + (int) Math.floor(min) + " " + (int) Math.round(mid));
        bw.flush();
        bw.close();
        br.close();

    }

}
