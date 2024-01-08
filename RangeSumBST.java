package Leetcode;

import javax.swing.tree.TreeNode;

public class RangeSumBST {
    public static void main(String[] args) {
        TreeNode a = new TreeNode();
    }

    public static class TreeNode(
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
  )

    public static int rangeSumBST(TreeNode root, int low, int high){
        if(root == null) {
            return 0;
        }

        if(low <= root.value && high >= root.value) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }else if(low > root.value) {
            return rangeSumBST(root.right, low, high);
        }else{
            return rangeSumBST(root.left, low, high);
        }
    }
}
