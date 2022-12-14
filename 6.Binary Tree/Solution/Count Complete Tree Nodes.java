public class Solution {

    // fast
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        TreeNode left = root.left, right = root.right;

        int l = 1, r = 1;

        while (left != null) {
            ++l;
            left = left.left;
        }

        while (right != null) {
            ++r;
            right = right.right;
        }

        if (l == r) {
            return (1 << l) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }


    /* ************************************************************************************************************* */

    // slow 
    int count = 0;
    public void preOrder(TreeNode root){
        if(root == null) return;
        count++;
        preOrder(root.left);
        preOrder(root.right);
    }
    public int countNodes2(TreeNode root) {
       preOrder(root);
       return count;
    }
}