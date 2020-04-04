package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_530 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int age = Integer.parseInt(st.nextToken());

        if (age >= 20) {
            bw.write("adult");
        } else {
            bw.write((20 - age) + " years later");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
