/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    // Function to find the minimum element in the given BST.
    public int minValue(Node root) {
        if(root==null){
            return -1;
        }
        if(root.left==null){
            return root.data;
        }
       return minValue(root.left);  
    }
    
}
