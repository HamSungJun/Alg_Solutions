package Jungol.LanguageCoder.Input;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_515 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sBuf = new StringBuilder();
        sBuf.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        sBuf.append(a).append(" / ").append(b).append(" = ").append(a / b);

        bw.write(sBuf.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
