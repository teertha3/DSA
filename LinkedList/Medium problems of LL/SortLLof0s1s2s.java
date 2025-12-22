/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int c0=0,c1=0,c2=0;
        while(temp!=null){
            if(temp.data==0){
                c0++;
            }
            else if(temp.data==1){
                c1++;
            }
            else{
                c2++;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(c0!=0){
                temp.data=0;
                c0--;
            }
            else if(c1!=0){
                temp.data=1;
                c1--;
            }
            else{
                temp.data=2;
                c2--;
            }
            temp=temp.next;
        }
        return head;
    }
}
