/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode insertBeforeKthElement(ListNode head,int k, int X) {
        ListNode newNode=new ListNode(X);
        if(head==null){
            return newNode;
        }
        if(k==1){
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            return head;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c+=1;
            if(c==k){
              break;
            }
            temp=temp.next;
        }
        ListNode prev_n=temp.prev;
        newNode.next=temp;
        newNode.prev=prev_n;
        prev_n.next=newNode;
        temp.prev=newNode;
        return head;
    }
}
