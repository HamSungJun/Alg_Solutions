package Jungol.LanguageCoder.Control;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_531 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double weight = Double.parseDouble(st.nextToken());

        if(88.45 < weight){
            bw.write("Heavyweight");
        } else if (72.57 < weight && weight <= 88.45){
            bw.write("Cruiserweight");
        } else if (61.23 < weight && weight <= 72.57){
            bw.write("Middleweight");
        } else if (50.80 < weight && weight <= 61.23){
            bw.write("Lightweight");
        } else if (weight <= 50.80){
            bw.write("Flyweight");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
