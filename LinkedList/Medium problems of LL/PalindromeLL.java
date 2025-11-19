//brute
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        Stack<Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.val!=st.peek()){
                return false;
            }
            st.pop();
            temp=temp.next;
        }
        return true;
    }
}

//optimal

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        //finding middle node
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reversing 2nd half
        ListNode newHead=reverseFun(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        //checking for LL palindrome 
        while(second!=null){
            if(first.val!=second.val){
                newHead=reverseFun(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        newHead=reverseFun(newHead);
        return true;
    }
    public static ListNode reverseFun(ListNode head){
        ListNode prev_n=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev_n;
            prev_n=curr;
            curr=next;
        }
        return prev_n;
    }
}
