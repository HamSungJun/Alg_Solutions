package Jungol.LanguageCoder.Debug;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_117 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        int SUM = ((int)A+(int)B+(int)C);
        int AVG = (int)((A+B+C) / 3);

        bw.write("sum "+ SUM);
        bw.newLine();
        bw.write("avg "+ AVG);
        bw.flush();
        bw.close();
        br.close();

    }

}
