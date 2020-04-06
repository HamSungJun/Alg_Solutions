package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_581 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(maxAbs(A, B) + "");
        bw.newLine();

        st = new StringTokenizer(br.readLine(), " ");
        double dA = Double.parseDouble(st.nextToken());
        double dB = Double.parseDouble(st.nextToken());

        bw.write(String.format("%.2f", minAbs(dA, dB)));
        bw.flush();
        bw.close();
        br.close();

    }

    public static int maxAbs(int A, int B) {

        if (Math.abs(A) > Math.abs(B)) {
            return A;
        } else {
            return B;
        }

    }

    public static double minAbs(double dA, double dB) {

        if (Math.abs(dA) > Math.abs(dB)) {
            return dB;
        } else {
            return dA;
        }

    }
}
