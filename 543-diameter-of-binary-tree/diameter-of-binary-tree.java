class Solution {
    int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight(root);
        return maxDiameter;
    }
    
    private int calculateHeight(TreeNode root) {
        if (root == null) return 0;
        
        // Get heights of left and right subtrees
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        
        // Diameter through current node = leftHeight + rightHeight
        int currentDiameter = leftHeight + rightHeight;
        
        // Update global maximum
        maxDiameter = Math.max(maxDiameter, currentDiameter);
        
        // Return height of current node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
