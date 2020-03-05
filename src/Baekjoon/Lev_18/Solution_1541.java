package Baekjoon.Lev_18;

import java.io.*;
import java.util.Stack;

public class Solution_1541 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> op = new Stack<>();
        StringBuilder sBuf = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != '-' && sentence.charAt(i) != '+') {
                sBuf.append(sentence.charAt(i));
            } else {
                numbers.push(Integer.parseInt(sBuf.toString()));
                op.push(sentence.charAt(i));
                sBuf.delete(0, sBuf.length());
            }
        }
        numbers.push(Integer.parseInt(sBuf.toString()));
        int acc = 0;
        while (!op.isEmpty()) {
            char oper = op.pop();
            int nextInt = numbers.pop();
            if (oper == '-') acc -= nextInt;
            else numbers.push(nextInt + numbers.pop());
        }

        bw.write("" + (acc + numbers.pop()));
        bw.flush();
        bw.close();
        br.close();

    }

}
