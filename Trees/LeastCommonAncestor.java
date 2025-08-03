/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    // Function to return the lowest common ancestor in a Binary Tree.
    Node lca(Node root, int n1, int n2) {
        if(root.data>n1 && root.data>n2){
            return lca(root.left,n1,n2);
        }
        else if(root.data<n1 && root.data<n2){
            return lca(root.right,n1,n2);
        }
        else{
              return root;
        }
        
    }
}
