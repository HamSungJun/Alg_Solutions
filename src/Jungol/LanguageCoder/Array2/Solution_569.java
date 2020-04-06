package Jungol.LanguageCoder.Array2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_569 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int success = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
            double sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            if (sum / 4 >= 80) {
                bw.write("pass\n");
                success += 1;
            } else {
                bw.write("fail\n");
            }
        }

        bw.write("Successful : " + success);
        bw.flush();
        bw.close();
        br.close();

    }

}
