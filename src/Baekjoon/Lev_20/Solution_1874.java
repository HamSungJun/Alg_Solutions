package Baekjoon.Lev_20;

import java.io.*;
import java.util.Stack;

public class Solution_1874 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> myStack = new Stack<>();
        StringBuilder sBuf = new StringBuilder();

        int[] target = new int[N];

        for (int i = 0; i < N; i++) {
            target[i] = Integer.parseInt(br.readLine());
        }

        int targetPointer = 0;
        for (int i = 1; i <= N; i++) {
            myStack.push(i);
            sBuf.append("+\n");
            while (!myStack.isEmpty() && myStack.peek() == target[targetPointer]) {
                myStack.pop();
                sBuf.append("-\n");
                targetPointer++;
            }
        }

        bw.write(myStack.isEmpty() ? sBuf.toString() : "NO");
        bw.flush();
        bw.close();
        br.close();

    }

}
