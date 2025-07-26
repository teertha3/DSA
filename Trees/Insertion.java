class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data=val;
        left=right=null;
    }
}
class Insertion{

    public static Node Insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=Insert(root.left, val);
        }
        else if(root.data<val){
            root.right=Insert(root.right, val);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={5,2,10,1,3,9,11};
        Node root=null;
        for(int val:values){
            root=Insert(root,val);
        }
        System.out.println("Elements in the tree (sorted):");
        Inorder(root);
    }

}