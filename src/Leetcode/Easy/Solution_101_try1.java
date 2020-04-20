package Leetcode.Easy;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution_101_try1 {

    Stack<Integer> leftTraverseStack = new Stack<>();
    Stack<Integer> rightTraverseStack = new Stack<>();

    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;
        traverseLeft(root.left);
        traverseRight(root.right);
        return isSameStack();

    }

    public void traverseLeft(TreeNode p) {

        if (p == null) {
            leftTraverseStack.push(null);
            return;
        }

        leftTraverseStack.push(p.val);
        traverseLeft(p.left);
        traverseLeft(p.right);

    }

    public void traverseRight(TreeNode q) {

        if (q == null) {
            rightTraverseStack.push(null);
            return;
        }

        rightTraverseStack.push(q.val);
        traverseRight(q.right);
        traverseRight(q.left);

    }

    public boolean isSameStack() {

        if (leftTraverseStack.size() != rightTraverseStack.size()) {
            return false;
        } else {

            for (int i = 0; i < leftTraverseStack.size(); i++) {
                if (leftTraverseStack.get(i) != rightTraverseStack.get(i)) {
                    return false;
                }
            }

        }

        return true;

    }

}