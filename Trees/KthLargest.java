/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public static int c;
    public static int res;
    public int kthLargest(Node root, int k) {
        c=0;
        res=-1;
        Inorder(root,k);
        return res;
        
    }
    public static void Inorder(Node root,int k){
        if(root==null|| c>=k){
            return;
        }
        Inorder(root.right,k);
        c++;
        if(c==k){
            res=root.data;
            return;
        }
        Inorder(root.left,k);
    }
}
