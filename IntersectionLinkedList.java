package Leetcode;

public class IntersectionLinkedList {    

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }

        ListNode pA = headA;
        
        while(pA != null){
            ListNode pB = headB;

            while(pB != null){
                if(pA == pB){
                    return pA;
                }        
                pB = pB.next;
            }
            pA = pA.next;
        }

        return null;
    }
}
