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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode next_node=current.next;//making a tempory connection to reach to the node next of current
            current.next=prev;//rotating the arrow
            prev=current;
            current=next_node;
        }
        return prev;
    }
}