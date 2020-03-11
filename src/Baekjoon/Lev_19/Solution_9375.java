package Baekjoon.Lev_19;

import java.io.*;
import java.util.*;

/*
 * 요점 : 종류별 옷의 갯수를 센다. 방법의 수는 종류별 (옷의 개수 + 입지 않은 경우[1]) * (옷의 개수 + 입지 않는 경우[1]) ... - (전체 다 입지 않는 경우[1]);
 */


public class Solution_9375 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> clothMap = new HashMap<>();

            for (int i = 0; i < N; i++) {

                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                String clothName = st.nextToken();
                String clothKind = st.nextToken();

                if (!clothMap.containsKey(clothKind)) {
                    clothMap.put(clothKind, 1);
                } else {
                    clothMap.put(clothKind, clothMap.get(clothKind) + 1);
                }

            }

            int ways = 1;
            for (int v : clothMap.values()) {
                ways *= (v + 1);
            }

            bw.write("" + (ways - 1));
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
