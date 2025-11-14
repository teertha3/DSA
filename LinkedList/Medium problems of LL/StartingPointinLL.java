/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//brute
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        HashMap<ListNode,Integer>hm=new HashMap<>();
        while(temp!=null){
            if(hm.containsKey(temp)){
                return temp;
            }
            hm.put(temp,1);
            temp=temp.next;
        }
        return null;
        
    }
}
//optimal
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode curr=head;
                while(curr!=slow){
                    curr=curr.next;
                    slow=slow.next;
                }
                return curr;
            }
        }
        return null;
        
    }
}
