package Baekjoon.Lev_10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        for (int i = 0; i < 3; i++) {

            StringTokenizer sTokenizer = new StringTokenizer(BUF_IN.readLine(), " ");
            String xPos = sTokenizer.nextToken();
            String yPos = sTokenizer.nextToken();

            mapOp(xMap, xPos);
            mapOp(yMap, yPos);

        }

        BUF_OUT.write(String.format("%s %s", findKey(xMap, 1), findKey(yMap, 1)));
        BUF_OUT.flush();
        BUF_OUT.close();
        BUF_IN.close();

    }

    public static void mapOp(Map<String, Integer> posMap, String pos) {

        if (!posMap.containsKey(pos)) {
            posMap.put(pos, 1);
        } else {
            posMap.put(pos, posMap.get(pos) + 1);
        }

    }

    public static String findKey(Map<String, Integer> posMap, int value) {

        String findingKey = "";
        for (String key : posMap.keySet()) {
            if (posMap.get(key) == value) {
                findingKey = key;
                break;
            }
        }
        return findingKey;
    }

}
