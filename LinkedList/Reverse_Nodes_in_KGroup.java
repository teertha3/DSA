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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int c=0;
        while(c<k){
            if(temp==null){
                return head;
            }
            temp=temp.next;
            c++;
            
        }
        ListNode previous=reverseKGroup(temp,k);
        temp=head;
        c=0;
        while(c<k){
            ListNode next=temp.next;
            temp.next=previous;
            previous=temp;
            temp=next;
            c++;
        }
        return previous;
      
    }
   
}
