package Leetcode.Easy.Algorithm;

class Solution_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        return isSameTreeRec(p, q);

    }

    public boolean isSameTreeRec(TreeNode p, TreeNode q) {

        if (p != null && q != null) {

            if (p.val == q.val && isSameTreeRec(p.left, q.left) && isSameTreeRec(p.right, q.right)) {
                return true;
            }


        } else {
            if (p == null && q == null) {
                return true;
            }
        }
        return false;

    }
}
