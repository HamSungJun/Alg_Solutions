package Jungol.LanguageCoder.Debug;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_526 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        /*
         * 곱의 정수형 캐스팅 , 각 변수의 정수형 캐스팅 이후 곱연산
         */
        bw.write("" + ((int) (A * B)) + " " + (((int) A) * ((int) B)));
        bw.flush();
        bw.close();
        br.close();

    }

}
