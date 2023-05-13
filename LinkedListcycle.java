public class LinkedListcycle {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hascycle(ListNode head){
        ListNode temp1 = head;
        ListNode temp2 = head;

        while(temp2 != null && temp2.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;

            if(temp1 == temp2){
                return true;
            }
        }

        return false;
    }
}
