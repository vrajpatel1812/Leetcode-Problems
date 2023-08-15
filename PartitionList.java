package Leetcode;

public class PartitionList {
    public class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNOde(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode(ListNode head, int x){
        ListNode temp1 = new ListNode(0);
        ListNode temp2 = new ListNode(0);
        ListNode left = temp1;
        ListNode right = temp2;

        while(head != null){
            if(head.val < x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }

        right.next = null;
        left.next = temp2.next;

        return temp1.next;
    }
}
