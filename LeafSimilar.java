package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LeafSimilar {
    public static void main(String[] args) {
        
    }

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

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = getList(root1);
        List<Integer> list2 = getList(root2);

        int size1 = list1.size();
        int size2 = list2.size();
        if(size1 != size2) {
            return false;
        }

        for(int i = 0; i < size1; i++) {
            if(!list1.get(i).equals(list2.get(i))){
                return false;
            }
        }

        return true;
    } 

    public static List<Integer> getList(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public static void dfs(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }

        if(root.left == null & root.right == null) {
            list.add(root.val);
            return;
        }

        dfs(root.left, list);
        dfs(root.right, list);
    }
}
