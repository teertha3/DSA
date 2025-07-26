import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data=val;
        left=right=null;
    }
}

public class Deletion {
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

    public static Node InorderSucessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static Node delete(Node root,int ele){
        if(root.data>ele){
            root.left=delete(root.left, ele);
        }
        else if(root.data<ele){
            root.right=delete(root.right, ele);
        }

        else{ 
            //case 1: Leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2: Node with one child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }

            //case 3: Node with two children
            Node IS=InorderSucessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right, IS.data);
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int values[]={5,2,10,1,3,9,11};
        Node root=null;
        for(int val:values){
            root=Insert(root,val);
        }
        System.out.println("Elements in the tree (Before deletion):");
        Inorder(root);

        System.out.println();

        System.out.print("Enter an element to delete:");
        int ele=sc.nextInt();

        root=delete(root,ele);

        System.out.println("Elements in the tree (After deletion):");
        Inorder(root);
    }
}
