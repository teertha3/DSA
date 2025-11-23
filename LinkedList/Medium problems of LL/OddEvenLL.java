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
//brute
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ArrayList<Integer>li=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            li.add(temp.val);
            temp=temp.next.next;
            
        }
        if(temp!=null){
            li.add(temp.val);
        }
        temp=head.next;
        while(temp!=null && temp.next!=null){
            li.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
            li.add(temp.val);
        }
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=li.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}

//optimal
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode e=head.next;
        ListNode o=head;
        ListNode eh=e;
        while(e!=null &&e.next!=null){
            o.next=e.next;
            o=o.next;
            e.next=o.next;
            e=e.next;
        }
        o.next=eh;
        return head;
    }
}
