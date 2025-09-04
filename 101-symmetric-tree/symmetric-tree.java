class Solution {
    public boolean sameTree(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        return sameTree(p.left,q.left) && sameTree(p.right,q.right);
    }
    public TreeNode invertTree(TreeNode root){
        if(root==null) return root;
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
        root.left=invertTree(root.left);
        return sameTree(root.left,root.right);
    }
}