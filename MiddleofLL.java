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

public class MiddleofLL {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }  
        int half = size/2;
        while(half != 0){
            head = head.next;
            half--;
        }
        return head;  
    }
}
