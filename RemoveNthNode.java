package Leetcode;

import LL.LL;

public class RemoveNthNode {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthfromEnd(ListNode head, int n) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int index = 0;

        while (index < n) {
            temp1 = temp1.next;
            index++;
        }

        if(temp1 == null) {
            return head.next;
        }

        while(temp1.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        temp2.next = temp2.next.next;
        return temp2;
    }

}
