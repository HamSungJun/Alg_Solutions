package Codility.CountingElements;

import java.util.*;

public class MissingInteger {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{-3, 4, -1, 2, 1, -6, 9}));

    }

    public static int solution(int[] A){

        Set<Integer> checker = new HashSet<>();
        for (int i = 0; i < A.length; i++) {

            if(A[i] > 0){
                checker.add(A[i]);
            }

        }

        if(checker.size() == 0) return 1;

        List<Integer> positiveList = new ArrayList<>(checker);
        Collections.sort(positiveList);

        int i = 0;
        while(i < positiveList.size()){

            if(positiveList.get(i) != i+1) {
                break;
            }
            i++;

        }

        return (i+1);

    }

}
