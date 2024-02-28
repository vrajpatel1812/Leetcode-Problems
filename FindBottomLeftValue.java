import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class FindBottomLeftValue {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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

    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList();
        TreeNode leftMost = null;
        nodes.offer(root);

        while(!nodes.isEmpty()) {
            leftMost = nodes.poll();

            if(leftMost.right != null) {
                nodes.offer(leftMost.right);
            }

            if(leftMost.left != null) {
                nodes.offer(leftMost.left);
            }
        }

        return leftMost.val;
    }
}
