//Delete a node in linked list
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        ListNode curr=node;
        while(curr!=null){
            System.out.print(curr.val);
            curr=curr.next;
        }
    }
}
