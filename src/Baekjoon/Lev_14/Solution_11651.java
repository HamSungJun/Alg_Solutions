package Baekjoon.Lev_14;

import java.io.*;
import java.util.*;

public class Solution_11651 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 8192);

        int N = Integer.parseInt(br.readLine());
        List<PositionNode> posList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            posList.add(new PositionNode(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(posList, new Comparator<PositionNode>() {

            @Override
            public int compare(PositionNode node_1, PositionNode node_2) {
                int yPos_1 = node_1.getY();
                int yPos_2 = node_2.getY();

                if (yPos_1 > yPos_2) {
                    return 1;
                } else if (yPos_1 < yPos_2) {
                    return -1;
                }

                int xPos_1 = node_1.getX();
                int xPos_2 = node_2.getX();

                if (xPos_1 > xPos_2) {
                    return 1;
                } else if (xPos_1 < xPos_2) {
                    return -1;
                }

                return 0;

            }

        });

        for (int i = 0; i < posList.size(); i++) {
            PositionNode nextPosNode = posList.get(i);
            bw.write(String.format("%d %d", nextPosNode.getX(), nextPosNode.getY()));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
