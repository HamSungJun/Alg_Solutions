package Leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

class Solution_118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> l1 = new ArrayList<>();

        if(numRows == 0){
            return l1;
        } else {

            for(int i = 0; i < numRows; i++){
                l1.add(new ArrayList<>());
                for(int j = 0; j <= i; j++){
                    if(j == 0 || j == i){
                        l1.get(i).add(1);
                    } else {
                        l1.get(i).add(l1.get(i-1).get(j-1) + l1.get(i-1).get(j));
                    }
                }
            }

        }

        return l1;

    }

}
