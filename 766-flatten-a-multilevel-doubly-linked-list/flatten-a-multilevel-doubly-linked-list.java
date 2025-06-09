/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node childHead = flatten(current.child); // Flatten the child list
                
                Node nextNode = current.next; // Preserve the next node
                
                current.next = childHead; // Connect current to child
                childHead.prev = current; // Maintain previous link

                // Find the last node of the child list
                while (childHead.next != null) {
                    childHead = childHead.next;
                }

                // Connect the last node of child list to the next node
                childHead.next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = childHead;
                }

                current.child = null; // Remove child pointer
            }

            current = current.next; // Move to next node
        }

        return head;
    }
}