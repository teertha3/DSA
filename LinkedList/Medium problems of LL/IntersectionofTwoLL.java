//Brute force
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer>hm=new HashMap<>();
        ListNode temp=headA;
        while(temp!=null){
            hm.put(temp,1);
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            if(hm.containsKey(temp)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}
//Optimal
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1=findLen(headA);
        int n2=findLen(headB);
        if(n1<n2){
            return collisonPoint(headA,headB,n2-n1);
        }
        return collisonPoint(headB,headA,n1-n2);
    }
    public static int findLen(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public static ListNode collisonPoint(ListNode head1,ListNode head2,int pos){
        ListNode t1=head1;
        ListNode t2=head2;
        while(pos>0){
            t2=t2.next;
            pos--;
        }
        while(t1!=null && t2!=null){
            if(t1==t2){
                return t1;
            }
            t1=t1.next;
            t2=t2.next;
        }
        return null;
    }
}
