package Leetcode;
import org.w3c.dom.Node;

// import LL.*;
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

public class Binarytointlinked {
    public static int getDecimalValue(ListNode head){
        int number = 0;
        while(head != null){
            number = number*2 + head.value;
            head = head.next;
        }
        return number;
    }
}
