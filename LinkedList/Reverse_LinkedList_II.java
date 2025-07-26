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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode lprev=dummy;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            lprev=curr;
            curr=curr.next;
        }
        ListNode temp=curr;
        ListNode prev=null;
        for(int i=0;i<=right-left;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        lprev.next=prev;
        temp.next=curr;
        return dummy.next;
    }
}
