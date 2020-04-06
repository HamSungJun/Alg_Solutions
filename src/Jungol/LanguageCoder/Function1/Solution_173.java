package Jungol.LanguageCoder.Function1;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_173 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(getPowSub(A, B));
        bw.flush();
        bw.close();
        br.close();

    }

    public static String getPowSub(int A, int B) {

        return (int) Math.pow(Math.max(A, B), 2) - (int) Math.pow(Math.min(A, B), 2) + "";

    }

}
