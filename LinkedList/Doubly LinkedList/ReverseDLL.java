/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/
//approach 1, using 2 passes 
//Time complexity- O(2N), Space Complexity- O(N)
class Solution {
    public ListNode reverseDLL(ListNode head) {
       if(head==null || head.next!=null){
            return head;
        }
        ListNode temp=head;
        Stack<Integer>st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }
}

//approach 2, Time complexity- O(N), Space complexity- O(1)
/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

class Solution {
    public ListNode reverseDLL(ListNode head) {
        if(head==null || head.next!=null){
            return head;
        }
        ListNode curr=head;
        ListNode last=null;
        while(curr!=null){
            last=curr.prev;
            curr.prev=curr.next;
            curr.next=last;
            curr=curr.prev;
        }
        return last.prev;
    }
}

