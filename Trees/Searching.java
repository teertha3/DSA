import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data=val;
        left=right=null;
    }
}

public class Searching {
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

    public static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data<key){
            return Search(root.right, key);
        }
        return Search(root.left, key);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int values[]={5,2,10,1,3,9,11};
        Node root=null;
        for(int val:values){
            root=Insert(root,val);
        }
        System.out.print("Enter the value you want to search:");
        int key=sc.nextInt();
        if(Search(root,key)){
            System.out.print(key+" is found");
        }else{
            System.out.print(key+" is not found");
        }
    }
}
