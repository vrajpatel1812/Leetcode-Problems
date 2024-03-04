package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import Leetcode.TreeNode;

public class EvenOddTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);

        root.addLeftChild(root, 4);
        root.addRightChild(root, 2);

        TreeNode left1 = root.left;
        left1.addLeftChild(left1, 3);
        left1.addRightChild(left1, 3);
        TreeNode left2 = root.right;
        left2.addLeftChild(left2, 7);
        // left2.addRightChild(left2, 8);

        // TreeNode right1 = root.right;
        // right1.addLeftChild(right1, 7);
        // right1.addRightChild(right1, 9);
        // TreeNode right2 = right1.left;
        // right2.addLeftChild(right2, 6);
        // TreeNode right3 = right1.right;
        // right3.addRightChild(right3, 2);

        System.out.println(isEvenOddTree(root));
    }


    public static boolean isEvenOddTree(TreeNode root) {
        if(root.val % 2 == 0) {
            return false;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int index = 1;
        
        while(!nodes.isEmpty()) {
            int size = nodes.size();
            
            while (size > 0) {
                TreeNode node = nodes.poll();
                // System.out.println(node.val);

                if(node.left != null) {
                    nodes.add(node.left);
                }
                if(node.right != null) {
                    nodes.add(node.right);
                }

                size--;
            }
            
            if(index % 2 != 0) {
                if(oddIndex(nodes) == false) {
                    return false;
                }
            }else{
                if(evenIndex(nodes) == false) {
                    return false;
                }
            }

            index++;
        }

        return true;
    }

    public static boolean oddIndex(Queue<TreeNode> nodes) {
        // System.out.println("Odd function");
        int[] arr = new int[nodes.size()];
        int index = 0;
        for(TreeNode node : nodes) {
            if(node.val % 2 != 0) {
                return false;
            }
            
            arr[index] = node.val;
            index++;
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<nodes.size()-1; i++) {
            if(arr[i] <= arr[i+1]) {
                // System.out.println("Not Strickly Decresing");
                return false;
            }
        }
        
        return true;
    }

    public static boolean evenIndex(Queue<TreeNode> nodes) {
        // System.out.println("Even function");
        int[] arr = new int[nodes.size()];
        int index = 0;
        for(TreeNode node : nodes) {
            // System.out.println(node.val);
            if(node.val % 2 == 0) {
                // System.out.println("Odd Condition is false");
                return false;
            }
            
            arr[index] = node.val;
            index++;
        }

        // System.out.println(Arrays.toString(arr));

        for(int i = 0; i<nodes.size()-1; i++) {
            if(arr[i] >= arr[i+1]) {
                // System.out.println("Not Strickly Incrising");
                return false;
            }
        }

        return true;
    }

}
