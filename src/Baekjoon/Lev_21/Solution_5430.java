package Baekjoon.Lev_21;

import java.io.*;
import java.util.*;

public class Solution_5430 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            String[] op = br.readLine().split("");
            Queue<String> myOpDeque = new LinkedList<>();
            myOpDeque.addAll(Arrays.asList(op));

            int N = Integer.parseInt(br.readLine());

            String numberLine = br.readLine();
            StringTokenizer st = new StringTokenizer(numberLine.substring(1, numberLine.length() - 1), ",");
            Deque<Integer> myNumberDeque = new ArrayDeque<>();
            while (st.hasMoreTokens()) {
                myNumberDeque.add(Integer.parseInt(st.nextToken()));
            }

            StringBuilder sBuf = new StringBuilder();
            boolean isError = false;
            while (!myOpDeque.isEmpty()) {

                if (myOpDeque.peek().equals("R")) {

                    int revCount = 0;
                    while (!myOpDeque.isEmpty() && !myOpDeque.peek().equals("D")) {
                        revCount += 1;
                        myOpDeque.poll();
                    }

                    if (revCount % 2 != 0) {
                        Deque<Integer> tempDeque = new ArrayDeque<>();
                        while (!myNumberDeque.isEmpty()) {
                            tempDeque.addLast(myNumberDeque.pollLast());
                        }
                        myNumberDeque = tempDeque;
                    }

                } else if (myOpDeque.peek().equals("D")) {

                    while(!myOpDeque.isEmpty() && myOpDeque.peek().equals("D")){
                        myOpDeque.poll();
                        if(!myNumberDeque.isEmpty()){
                            myNumberDeque.pollFirst();
                        } else {
                            isError = true;
                            sBuf.append("error");
                            break;
                        }
                    }

                }

            }

            if(isError){
                bw.write(sBuf.toString());
                bw.newLine();
            } else {
                bw.write(sBuf.append(Arrays.toString(myNumberDeque.toArray())).toString().replaceAll(" ",""));
                bw.newLine();
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}
