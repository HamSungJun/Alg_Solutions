package Jungol.LanguageCoder.Debug;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_527 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        /*
         * 두 정수형 변수의 나눗셈 , 정수의 실수형 캐스팅 이후 나눗셈
         */
        bw.write(String.format("%d %.2f", (A/B), ((double) A / B)));
        bw.flush();
        bw.close();
        br.close();

    }

}
