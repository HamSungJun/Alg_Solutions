package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_529 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int tall = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        int obesity = weight + 100 - tall;

        bw.write("" + obesity);
        if (obesity > 0) {
            bw.newLine();
            bw.write("Obesity");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
