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
   /*static void inorder(TreeNode root,ArrayList<Integer> list){
             if(root==null){
                  return ;
             }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
   }*/


    public List<Integer> inorderTraversal(TreeNode root) {
       /* ArrayList<Integer> list=new ArrayList<Integer>();
        inorder(root,list);
        return list;*/
        Stack<TreeNode> st=new Stack<TreeNode>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()){
                    return list;
                }
                node=st.pop();
                list.add(node.val);
                node=node.right;
            }
        }
    }    
}
    