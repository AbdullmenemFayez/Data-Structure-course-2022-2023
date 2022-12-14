class Solution {
    public boolean isSymmetric(TreeNode root) {
       return helper(root,root);
        
    }
    boolean helper(TreeNode r , TreeNode o ){
        if(r == null && o == null)return true;
        if(r == null || o == null)return false;
        return (r.val == o.val)&& helper(r.left, o.right) && helper(r.right, o.left);
    }
}