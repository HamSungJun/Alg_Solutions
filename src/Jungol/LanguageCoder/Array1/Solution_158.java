package Jungol.LanguageCoder.Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sBuf = new StringBuilder();

        int counter = 0;
        while (st.hasMoreTokens()) {
            int nextInt = Integer.parseInt(st.nextToken());
            if (nextInt == 0) {
                break;
            } else {
                counter += 1;
                sBuf.append(nextInt % 2 == 0 ? nextInt / 2 : nextInt * 2).append(" ");
            }
        }

        sBuf.insert(0, counter + "\n");
        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
