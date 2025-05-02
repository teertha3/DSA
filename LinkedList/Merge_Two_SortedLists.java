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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(-1);
        ListNode prev=temp;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null &&p2!=null){
            if(p1.val<p2.val){
                prev.next=p1;
                p1=p1.next;
                prev=prev.next;
            }
            else{
                prev.next=p2;
                p2=p2.next;
                prev=prev.next;
            }
        }
        if(p1!=null){
            prev.next=p1;
        }
        if(p2!=null){
            prev.next=p2;
        }
        return temp.next;
    }
}
