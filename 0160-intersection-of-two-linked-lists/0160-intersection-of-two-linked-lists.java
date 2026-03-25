/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int al=0,bl=0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(headA!=null)
        {
            al++;
            headA = headA.next;
        }
        while(headB!=null)
        {
            bl++;
            headB = headB.next;
        }
        while(al > bl)
        {
            al--;
            temp1 = temp1.next;
        }
        while(bl > al)
        {
            bl--;
            temp2 = temp2.next;
        }
        while(temp1!=temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}