/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int c=0;
        Node temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
            
        }
        return c;
    }
}
