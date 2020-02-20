package Codility.PrefixSums;

import java.util.Arrays;
import java.util.Stack;

public class MinAvgTwoSlice {

    static int minAvg;

    public static void main(String[] args) {

        int[] A = new int[]{4,2,2,5,1,5,8};
        Stack<Integer> basket = new Stack<>();
        boolean[] visited = new boolean[A.length];
        MinAvgTwoSlice(visited,A.length - 1, basket);

    }

    public static void MinAvgTwoSlice(boolean[] visited, int N, Stack<Integer> basket){

        if(basket.size() == 2){
            printStack(basket);
        }

        for (int i = 0; i <= N; i++) {

            if(visited[i]){
                continue;
            }

            if(basket.size() == 1 && basket.get(0) > i){
                continue;
            }

            basket.push(i);
            visited[i] = true;
            MinAvgTwoSlice(visited, N, basket);
            basket.pop();
            visited[i] = false;

        }


    }

    public static void printStack(Stack<Integer> basket){

        System.out.println(Arrays.toString(basket.toArray()));

    }

}
