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
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head.next;
        ListNode prev = head;

        int sum = 0;
        while(temp != null){
            if(temp.val == 0){
                ListNode newNode = new ListNode(sum);
                prev.next = newNode;
                prev = newNode;
                sum = 0;
            }
            sum += temp.val;
            temp = temp.next;
        }
        return head.next;
    }
}