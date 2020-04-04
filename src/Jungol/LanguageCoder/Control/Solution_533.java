package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_533 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String gender = st.nextToken();
        int age = Integer.parseInt(st.nextToken());

        if (gender.equals("M") && age >= 18) {
            bw.write("MAN");
        } else if (gender.equals("F") && age >= 18) {
            bw.write("WOMAN");
        } else if (gender.equals("M") && age < 18) {
            bw.write("BOY");
        } else if (gender.equals("F") && age < 18) {
            bw.write("GIRL");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
