package Baekjoon.Lev_14;

import java.io.*;
import java.util.*;

public class Solution_11650 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        int N = Integer.parseInt(br.readLine());
        List<PositionNode_Comparable> posList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            posList.add(new PositionNode_Comparable(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(posList);

        for (int i = 0; i < posList.size(); i++) {
            PositionNode_Comparable nextPosNode = posList.get(i);
            bw.write(String.format("%d %d", nextPosNode.getX(), nextPosNode.getY()));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
