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
    public ListNode insertBeforeTail(ListNode head, int X) {
        if(head==null){
            return newNode;
        }
        ListNode newNode=new ListNode(X);
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        ListNode prev_n=tail.prev;
        newNode.next=tail;
        newNode.prev=prev_n;
        prev_n.next=newNode;
        tail.prev=newNode;
        return head;
    }
}
