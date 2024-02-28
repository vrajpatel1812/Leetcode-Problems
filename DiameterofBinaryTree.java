public class DiameterofBinaryTree {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode head;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int diameter = 0;
    public static int diameterOfBinaryTree(TreeNode root) {      
        nodeLength(root);
        return diameter;    
    }

    public static int nodeLength(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int left = nodeLength(root.left);
        int right = nodeLength(root.right);
        diameter = Math.max(diameter, left+right);

        return Math.max(right, left) + 1;
    }
}
