package Baekjoon.Lev_21;

import java.io.*;
import java.util.*;

public class Solution_1021 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer stm = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> myDeque = new ArrayDeque<>();
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            myDeque.addLast(i);
        }

        while (M-- > 0) {
            myQueue.add(Integer.parseInt(stm.nextToken()));
        }

        int rotateSum = 0;
        while (!myQueue.isEmpty()) {

            if (myDeque.peek() == myQueue.peek()) {
                myDeque.poll();
                myQueue.poll();
            } else {

                int rightRotateCount = 0;
                int leftRotateCount = 0;
                ArrayDeque<Integer> myDequeClone = myDeque.clone();

                while (myDeque.peek() != myQueue.peek()) {
                    myDeque.addLast(myDeque.pollFirst());
                    rightRotateCount += 1;
                }

                while (myDequeClone.peek() != myQueue.peek()) {
                    myDequeClone.addFirst(myDequeClone.pollLast());
                    leftRotateCount += 1;
                }

                if (rightRotateCount >= leftRotateCount) {
                    rotateSum += leftRotateCount;
                    myDeque = myDequeClone;
                } else {
                    rotateSum += rightRotateCount;
                }


            }

        }

        bw.write("" + rotateSum);
        bw.flush();
        bw.close();
        br.close();


    }

}
