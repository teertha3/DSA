class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxNum(piles);
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            long totalhrs=funTotalHours(piles,mid);
            if(totalhrs<=(long)h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public static int maxNum(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int num:piles){
            max=Math.max(max,num);
        }
        return max;

    }
    public static long funTotalHours(int[] piles,int hourly){
        long totalhrs=0;
        for(int i=0;i<piles.length;i++){
            totalhrs+=((long)piles[i]+hourly-1)/hourly;
        }
        return totalhrs;
    }

}
