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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ArrayList<Integer>li=new ArrayList<>();
       ListNode t1=list1;
       ListNode t2=list2;
       while(t1!=null){
        li.add(t1.val);
        t1=t1.next;
       }
       while(t2!=null){
        li.add(t2.val);
        t2=t2.next;
       }
       Collections.sort(li);
       if(li.size()==0){
        return null;
       }
       ListNode head=new ListNode(li.get(0));
       ListNode temp=head;
       for(int i=1;i<li.size();i++){
        ListNode newNode=new ListNode(li.get(i));
        temp.next=newNode;
        temp=temp.next;
       }
       return head;
       
    }
}
