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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode agla=null;
        while(current!=null){
            agla=current.next;
            current.next=prev;
            prev=current;
            current=agla;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode temp1=head;
        ListNode temp2=slow.next;
        while(temp2!=null){
            if(temp1.val!=temp2.val) return false;
            temp1=temp1.next;
            temp2=temp2.next;
  
        }
        return true;
    }
}