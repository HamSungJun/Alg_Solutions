package Leetcode.Easy;

class Solution_104 {

    public int maxDepth = 1;

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        maxDepthRec(root, 1);
        return maxDepth;

    }

    public void maxDepthRec(TreeNode p, int depth){

        if(p.left == null && p.right == null){
            maxDepth = Math.max(maxDepth, depth);
            return;
        }

        if(p.left != null){
            maxDepthRec(p.left, depth+1);
        }

        if(p.right != null){
            maxDepthRec(p.right, depth+1);
        }


    }

}
