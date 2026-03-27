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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)
        {
            return head;
        }
        ListNode t1 = head;
        while(t1.next != null)
        {
            int a = gcd(t1.val, t1.next.val);
            ListNode temp = new ListNode(a);
            temp.next = t1.next;
            t1.next = temp;
            t1 = t1.next.next;
        }
        return head;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}