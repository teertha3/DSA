/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode node=new ListNode(X);
        node.next=head;
        head=node;
        if(head==null){
            head=node;
        }
        return head;
    }
}
