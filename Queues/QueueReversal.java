class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer>st=new Stack<>();
        while(!queue.isEmpty()){
            st.push(queue.poll());
        }
        while(!st.isEmpty()){
            queue.offer(st.pop());
        }
        return queue;
    }
}
