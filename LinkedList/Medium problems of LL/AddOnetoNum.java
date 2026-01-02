//Adding one to a number represented by Linked List

/*Definition of singly linked list:
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
//brute force solution
class Solution {
    public ListNode addOne(ListNode head) {
        head=reverseLL(head);
        ListNode temp=head;
        int carry=1;
        while(temp!=null){
            temp.val=temp.val+carry;
            if(temp.val<10){
                carry=0;
                break;
            }
            else{
                temp.val=0;
                carry=1;
            }
            temp=temp.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(1);
            head=reverseLL(head);
            newNode.next=head;
            return newNode;
        }
        head=reverseLL(head);
        return head;
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
