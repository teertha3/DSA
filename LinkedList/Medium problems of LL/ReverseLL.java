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
//Brute force
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.val=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;

    }
}
//optimal
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode back=null;
        while(curr!=null){
           ListNode front=curr.next;
           curr.next=back;
           back=curr;
           curr=front;
        }
        return back;
    }
}
