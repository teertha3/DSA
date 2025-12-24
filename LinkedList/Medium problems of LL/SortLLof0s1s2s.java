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

//optimal 
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
        if(head==null || head.next==null){
            return head;
        }
        ListNode zeroHead=new ListNode(-1);
        ListNode oneHead=new ListNode(-1);
        ListNode twoHead=new ListNode(-1);
        ListNode zero=zeroHead;
        ListNode one=oneHead;
        ListNode two=twoHead;
        ListNode temp=head;
        while(temp!=null){
            ListNode nextNode = temp.next;
            temp.next = null;   
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.data==1){
                one.next=temp;
                one=temp;
            }
            else{
                two.next=temp;
                two=temp;
            }
            temp=nextNode;
        }
        if(oneHead.next!=null){
            zero.next=oneHead.next;
        }
        else{
            zero.next=twoHead.next;
        }
        if(twoHead.next!=null){
            one.next=twoHead.next;
        }
        two.next=null;
        return zeroHead.next;
    }
}
