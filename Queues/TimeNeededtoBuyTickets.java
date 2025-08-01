class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int sec=0;
        while(!q.isEmpty()){
            sec++;
            int person=q.poll();
            if(tickets[person]>=1){
                tickets[person]-=1;
            }
            if(person==k && tickets[person]==0){
                break;
            }
            if(person!=k && tickets[person]==0){
                continue;
            }
            q.offer(person);
        }
        return sec;
        
    }
}
