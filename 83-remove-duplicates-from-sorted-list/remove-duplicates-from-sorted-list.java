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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode temp = head;
        
        while (temp != null && temp.next != null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next; // Skip the duplicate node
            } else {
                temp = temp.next; // Move to the next distinct node
            }
        }
        
        return head;
    }
}