package Leetcode.Easy.Algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution_119 {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> l1 = new ArrayList();
        l1.add(1);

        if (rowIndex == 0) {
            return l1;
        } else {

            l1.add(1);

            for (int i = 2; i <= rowIndex; i++) {

                List<Integer> l2 = new ArrayList();

                for (int j = 0; j <= i; j++) {

                    if (j == 0 || j == i) {
                        l2.add(1);
                    } else {
                        l2.add(l1.get(j - 1) + l1.get(j));
                    }

                }

                l1 = l2;

            }


        }

        return l1;

    }
}
