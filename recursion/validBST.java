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

// T : O(n) 
class validBST {
    public boolean isValidBSTHelper(TreeNode node, Integer lower, Integer higher){
        if(node==null){
            return true;
        }

        //  [2147483647]
        if(higher!=null && (node.val>=higher) || (lower!=null && node.val<= lower)){
            return false;
        }
        boolean left = isValidBSTHelper(node.left,lower,node.val);

        if(!left){
            return false;
        }

        boolean right = isValidBSTHelper(node.right,node.val,higher);

        return right;
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root,null,null);
    }
}