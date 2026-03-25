/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int l = 0;
        while(temp != null)
        {
            l++;
            temp = temp.next;
        }
        if(l == n)
        {
            return head.next;
        }
        int d = l - n;
        int k = 0;
        ListNode temp2 = head;
        while(k < d - 1)
        {
            temp2 = temp2.next;
            k++;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}