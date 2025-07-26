class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class Traversals {
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

    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);

    }

    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int values[]={5,2,10,1,3,9,11};
        Node root=null;
        for(int val:values){
            root=Insert(root,val);
        }
        System.out.print("Preorder traversal: ");
        Preorder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        Inorder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        Postorder(root);
        System.out.println();
        
    }
}
