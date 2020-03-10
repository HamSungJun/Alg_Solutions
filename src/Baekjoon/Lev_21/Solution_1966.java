package Baekjoon.Lev_21;

import java.io.*;
import java.util.*;

public class Solution_1966 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseLen = Integer.parseInt(br.readLine());
        for (int i = 0; i < caseLen; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringTokenizer stp = new StringTokenizer(br.readLine(), " ");
            Queue<int[]> myQueue = new LinkedList<>();
            int[] priorityCountArray = new int[10];
            int docLen = Integer.parseInt(st.nextToken());
            int targetIdx = Integer.parseInt(st.nextToken());
            int printCount = 0;
            int pPointer = 9;

            // 큐에 두칸짜리 배열로 [문서의 인덱스, 우선순위] 형태로 매긴다.
            for (int j = 0; j < docLen; j++) {
                // [0] = originIdx, [1] = priority;
                int nextPriority = Integer.parseInt(stp.nextToken());
                priorityCountArray[nextPriority] += 1;
                myQueue.add(new int[]{j, nextPriority});
            }

            while (!myQueue.isEmpty()) {

                // 다음 최고 우선순위를 가리키도록 한다.
                while (priorityCountArray[pPointer] == 0 && pPointer >= 1) {
                    pPointer--;
                }

                int[] nextPeek = myQueue.peek();
                if (nextPeek[1] == pPointer) {
                    myQueue.poll();
                    priorityCountArray[pPointer] -= 1;
                    printCount += 1;
                    if (nextPeek[0] == targetIdx) {
                        bw.write("" + printCount);
                        bw.newLine();
                        break;
                    }
                } else {
                    myQueue.add(myQueue.poll());
                }

            }

        }

        bw.flush();
        bw.close();
        br.close();

    }


}
