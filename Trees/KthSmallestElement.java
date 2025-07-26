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

    public static int c;
    public static int res;
    
    public int kthSmallest(TreeNode root, int k) {
       c=0;
       res=-1;
       inOrder(root,k);
       return res;
    }

    public static void inOrder(TreeNode root,int k){
        if(root==null || c>=k){
            return;
        }
        inOrder(root.left,k);
        c++;
        if(c==k){
            res= root.val;
            return;
        }
        inOrder(root.right,k);
    }
}
