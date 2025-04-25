class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList {
    private Node head;
    private int size=0;

    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;  
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
        
    }
    
    public void addAtTail(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
        }
        size++;
       
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node temp=head;
        Node newNode=new Node(val);
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;   
        size++; 
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }

        if(index==0){
            head=head.next;
        }
        else{
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        }
        size--;
        
    }
}
