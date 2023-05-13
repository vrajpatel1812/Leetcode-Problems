package Leetcode;

public class PalindromLinkedLIst {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head){
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp2 != null && temp2.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }

        if(temp2 != null){
            temp1 = temp1.next;
        }
        temp1 = reverseLinkedList(temp1);

        while(temp1 != null){
            if(temp1.val != head.val){
                return false;
            }
            temp1 = temp1.next;
            head = head.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
    
}
