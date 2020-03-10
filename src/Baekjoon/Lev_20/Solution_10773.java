package Baekjoon.Lev_20;

import java.io.*;
import java.util.Stack;

public class Solution_10773 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> myStack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int stackSum = 0;
        while (N-- > 0) {

            int nextInt = Integer.parseInt(br.readLine());
            if (nextInt > 0) {
                myStack.push(nextInt);
                stackSum += nextInt;
            } else if (nextInt == 0) {
                stackSum -= myStack.pop();
            }

        }

        bw.write("" + stackSum);
        bw.flush();
        bw.close();
        br.close();

    }

}
