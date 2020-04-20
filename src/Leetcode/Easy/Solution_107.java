package Leetcode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution_107 {

    List<List<Integer>> l1 = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if(root == null) return l1;
        l1.add(new ArrayList<>());
        traverseRec(root, 0);
        Collections.reverse(l1);
        return l1;

    }

    public void traverseRec(TreeNode p, int level){

        if(p == null){
            return;
        }

        if(l1.size() - 1 < level){
            l1.add(new ArrayList<>());
        }
        l1.get(level).add(p.val);

        if(p.left != null || p.right != null){
            traverseRec(p.left, level+1);
            traverseRec(p.right, level+1);
        }

    }

}
