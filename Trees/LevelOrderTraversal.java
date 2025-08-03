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
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>li=new LinkedList<>();
        if(root==null){
            return li;
        }
        if(q.isEmpty()){
            q.offer(root);
        }
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>sl=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                sl.add(curr.val);

                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            li.add(sl);
            
        }
        return li;
        
    }
}
