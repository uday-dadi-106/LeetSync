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
  static int hight(TreeNode root){
   if(root==null){
    return 0;
   }
   int l=hight(root.left);
   int r=hight(root.right);
   return Math.max(l,r)+1;
  }

   static boolean check(TreeNode root){
     if(root==null){
        return true;
     }
    int lefthight=hight(root.left);
    int righthight=hight(root.right);
    int h=lefthight-righthight;
    if(Math.abs(h)>1){
        return false;
    }
    boolean left=check(root.left);
    boolean right=check(root.right);
    if(left==false||right==false){
        return false;
    }
    return true;
   }
    public boolean isBalanced(TreeNode root) {
       return check(root); 
    }
}