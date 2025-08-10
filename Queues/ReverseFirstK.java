// using extra space (another stack)
class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Queue<Integer>res=new LinkedList<>();
        Stack<Integer>st=new Stack<>();
         if(q==null || k<=0 || k>q.size()){
             return q;
         }
        
        for(int i=1;i<=k;i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            res.offer(st.pop());
        }
        
        while(!q.isEmpty()){
            res.offer(q.poll());
        }
        return res;
    }
}

//optimal
class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer>st=new Stack<>();
         if(q==null || k<=0 || k>q.size()){
             return q;
         }
        for(int i=1;i<=k;i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        int rem=q.size()-k;

        for(int i=0;i<rem;i++){
            q.offer(q.poll());
        }
        return q;
    }
}

