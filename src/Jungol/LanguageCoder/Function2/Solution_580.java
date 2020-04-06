package Jungol.LanguageCoder.Function2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_580 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        bw.write(isValidDate(month, day) ? "OK!" : "BAD!");
        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean isValidDate(int month, int day) {

        int[] dayMap = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (!(1 <= month && month <= 12)) {
            return false;
        } else {
            if (!(1 <= day && day <= dayMap[month - 1])) {
                return false;
            }
        }

        return true;

    }

}
