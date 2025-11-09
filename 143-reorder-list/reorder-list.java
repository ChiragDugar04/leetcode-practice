class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Split and reverse second half
        ListNode second = slow.next;  
        slow.next = null;        
        ListNode prev = null, cur = second;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        
       //Merge two halves: first=head, second=prev
        ListNode first = head, secondHalf = prev;
        while (secondHalf != null) {
            ListNode t1 = first.next;
            ListNode t2 = secondHalf.next;

            first.next = secondHalf;
            secondHalf.next = t1;

            first = t1;
            secondHalf = t2;
        }
    
    }
}
