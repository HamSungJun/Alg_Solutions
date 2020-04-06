package Jungol.LanguageCoder.Iteration2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_133 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double acc = 0;

        while (st.hasMoreTokens()) {
            acc += Integer.parseInt(st.nextToken());
        }

        bw.write(String.format("%.2f", (acc / T)));
        bw.flush();
        bw.close();
        br.close();

    }

}
