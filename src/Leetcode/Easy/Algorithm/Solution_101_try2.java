package Leetcode.Easy.Algorithm;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution_101_try2 {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;
        return isSymmetricRec(root.left, root.right);

    }

    public boolean isSymmetricRec(TreeNode p, TreeNode q) {

        if (p != null && q != null) {

            if (p.val == q.val && isSymmetricRec(p.left, q.right) && isSymmetricRec(p.right, q.left)) {
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