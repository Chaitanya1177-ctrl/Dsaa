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

    int ss(TreeNode root){
        if(root==null)return 0;
        int left=ss(root.left);
        int right=ss(root.right);
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int left=ss(root.left);
        int right=ss(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }
        boolean le=isBalanced(root.left);
        boolean ri=isBalanced(root.right);
        if(!le || !ri)return false;
        return true;
        
    }
}