/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int level=0;
        int size=0;
        while(!queue.isEmpty()){
            size=queue.size();
            while(size>0){
                TreeNode a=queue.poll();
                size--;
                if(a.left!=null){
                    queue.offer(a.left);
                }
                if(a.right!=null){
                    queue.offer(a.right);
                }
            }
            level++;
            
        }
        return level;
    }
}