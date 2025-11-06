class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DoublyLinkedList {
    public static Node insertNode(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;

        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=null;
        for(int num:arr){
            head=insertNode(head,num);
        }
        System.out.print("Linked List: ");
        display(head);
    }
}
