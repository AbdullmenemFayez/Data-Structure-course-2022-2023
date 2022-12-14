class Solution {
    TreeNode invertTree(TreeNode root) {
           return helper(root);
       }
       TreeNode helper(TreeNode root){
           if(root!=null){
               TreeNode left=helper(root.left);
               root.left= helper(root.right);
               root.right=left;
           }
           return root;
       }
   }