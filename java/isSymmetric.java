/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return checkSymHelper(root.left, root.right);
    }

    public boolean checkSymHelper(TreeNode n1, TreeNode n2){
        if((n1 == null && n2 == null) || 
                (n1 != null && 
                 n2 != null && 
                 n1.val == n2.val && 
                 checkSymHelper(n1.left, n2.right) && 
                 checkSymHelper(n1.right, n2.left))){
            return true;
                 }
        return false;
    }
}
