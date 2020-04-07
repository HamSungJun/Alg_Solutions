package Jungol.LanguageCoder.Function3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_236 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        bw.write(fn(A * B * C) + "");
        bw.flush();
        bw.close();
        br.close();

    }

    public static int fn(int ABC) {

        if (ABC == 0) {
            return 1;
        }

        return fn(ABC / 10) * (ABC % 10 == 0 ? 1 : ABC % 10);

    }

}
