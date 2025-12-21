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


//Optimal
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
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null){
        return head;
       }
       ListNode mid=findMid(head);
       ListNode lefthead=head;
       ListNode righthead=mid.next;
       mid.next=null;
       lefthead=sortList(lefthead);
       righthead=sortList(righthead);
       return mergeLL(lefthead,righthead);
    }
    public static ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode mergeLL(ListNode lefthead,ListNode righthead){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(lefthead!=null && righthead!=null){
            if(lefthead.val<righthead.val){
                temp.next=lefthead;
                temp=lefthead;
                lefthead=lefthead.next;
            }
            else{
                temp.next=righthead;
                temp=righthead;
                righthead=righthead.next;
            }
        }
        if(lefthead!=null){
            temp.next=lefthead;
        }
        else{
            temp.next=righthead;
        }
        return dummy.next;

    }
    
}
