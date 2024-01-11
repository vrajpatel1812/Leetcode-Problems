package Leetcode;

public class MaxanceDiff {

    public class TreeNode {
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
    }

    public static int diff = 0;

    public int maxAncestorDiff(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int max = root.val, min = root.val;
        diff(root, max, min);
        return diff;
    }

    public static void diff(TreeNode root, int max, int min) {
        if(root == null) {
            return;
        }

        diff = Math.max(diff, Math.max(Math.abs(max - root.val), Math.abs(min - root.val)));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        diff(root.left, max, min);
        diff(root.right, max, min);
    }
}
