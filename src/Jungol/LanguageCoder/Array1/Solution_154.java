package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_154 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double[] weights = new double[6];
        double weightAcc = 0;
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Double.parseDouble(st.nextToken());
            weightAcc += weights[i];
        }

        bw.write(String.format("%.1f", weightAcc / 6));
        bw.flush();
        bw.close();
        br.close();

    }

}
