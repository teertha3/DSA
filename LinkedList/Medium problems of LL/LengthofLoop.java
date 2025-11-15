/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */
//brute
 class Solution {
     public int findLengthOfLoop(ListNode head) {
        HashMap<ListNode,Integer>hm=new HashMap<>();
        ListNode temp=head;
        int t=1;
        while(temp!=null){
            if(hm.containsKey(temp)){
                int v=hm.get(temp);
                return (t-v);
            }
            hm.put(temp,t);
            t++;
            temp=temp.next;
        }
        return 0;
     }
 }
//optimal
class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return lenofLL(slow,fast);
            }
        }
        return 0;
     }
     public static int lenofLL(ListNode slow,ListNode fast){
        int c=1;
        fast=fast.next;
        while(slow!=fast){
            c++;
            fast=fast.next;
        }
        return c;
     }
 }

