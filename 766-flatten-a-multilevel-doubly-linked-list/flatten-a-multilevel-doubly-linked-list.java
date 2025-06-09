/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

import java.util.Stack;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        Stack<Node> stack = new Stack<>();
        Node current = head;

        while (current != null) {
            if (current.child != null) {
                if (current.next != null) {
                    stack.push(current.next); // Save next node for later processing
                }

                // Connect child list to current node
                current.next = current.child;
                current.child.prev = current;
                current.child = null; // Remove child pointer
            }

            // If at the end of a level, pop from stack to continue
            if (current.next == null && !stack.isEmpty()) {
                Node nextNode = stack.pop();
                current.next = nextNode;
                nextNode.prev = current;
            }

            current = current.next;
        }

        return head;
    }
}