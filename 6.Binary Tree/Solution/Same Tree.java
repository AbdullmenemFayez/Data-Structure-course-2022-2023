class Solution {
    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)return true;
        if(t1 == null || t2 == null)return false;
        
        return (t1.val == t2.val) && isSameTree(t1.left,t2.left) && isSameTree(t1.right,t2.right);
       
    }
      
}