package Leetcode;

public class AmountofTime {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxlength = 0;

    public static int amountofTime(TreeNode root, int start) {
        traverse( root, start);
        return maxlength;
    }

    public static int traverse(TreeNode root, int start) {
        int depth = 0;

        if(root == null) {
            return depth;
        }
        
        int leftdepth = traverse(root.left, start);
        int rightdepth = traverse(root.right, start);

        if(root.val == start) {
            maxlength = Math.max(leftdepth, rightdepth);
            depth = -1;
        }else if(leftdepth >= 0 && rightdepth >= 0) {
            depth = Math.max(leftdepth, rightdepth) + 1;
        }else{
            int distance = Math.abs(leftdepth) + Math.abs(rightdepth);
            maxlength = Math.max(distance, maxlength);
            depth = Math.min(leftdepth, rightdepth) - 1;
        }

        return depth;
    }
}
