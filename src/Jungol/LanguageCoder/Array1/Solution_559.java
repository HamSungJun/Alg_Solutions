package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_559 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        double[] arr = new double[]{85.6, 79.5, 83.1, 80.0, 78.2, 75.0};

        bw.write(String.format("%.1f", (arr[A - 1] + arr[B - 1])));
        bw.flush();
        bw.close();
        br.close();

    }

}
