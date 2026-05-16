
public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
 
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return recsearchBST(root, val);
        // T:O(n) S:O(1) 
        //  TreeNode curr = root;
        //  while(curr!=null){
        //     if(curr.val == val){
        //         return curr;
        //     }else if (val>curr.val){
        //         curr = curr.right;
        //     }else{
        //         curr = curr.left;
        //     }
        //  }
        //  return null;
    }
    public TreeNode recsearchBST(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val>root.val){
            return recsearchBST(root.right, val);
        }
        return recsearchBST(root.left, val);
    }
}