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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> qe=new LinkedList<TreeNode>();
        if(root==null){
            return ans;
        }
        qe.offer(root);
        while(!qe.isEmpty()){
          int n=qe.size();
          ArrayList<Integer> du=new ArrayList<Integer>();
          for(int i=0;i<n;i++){
            if(qe.peek().left!=null){
                qe.offer(qe.peek().left);
            }
            if(qe.peek().right!=null){
                qe.offer(qe.peek().right);
            }
            du.add(qe.poll().val);
          }
          ans.add(du);
        }
        return ans;
    }
}