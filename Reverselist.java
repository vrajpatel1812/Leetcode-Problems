package LL;

class ListNode{
    int value;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int value){
        this.value = value;
    }
    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }
}

public class Reverselist {
    
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node; 
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;

        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}
