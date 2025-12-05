/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//Brute
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        if(c==1){
            return head.next;
        }
        int r=c/2;
        temp=head;
        while(temp!=null){
            r--;
            if(r==0){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}
//Optimal
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
