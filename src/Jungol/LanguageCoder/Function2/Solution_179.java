package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_179 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] dIn = new double[3];

        double dSum = 0;
        for (int i = 0; i < dIn.length; i++) {
            dIn[i] = Double.parseDouble(st.nextToken());
            dSum += dIn[i];
        }

        bw.write((int)Math.round(dSum/3)+"");
        bw.newLine();

        dSum = 0;
        for (int i = 0; i < dIn.length; i++) {
            dSum += Math.round(dIn[i]);
        }

        bw.write((int)Math.round(dSum/3)+"");
        bw.flush();
        bw.close();
        br.close();

    }

}
