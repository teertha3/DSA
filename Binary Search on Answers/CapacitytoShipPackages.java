//Brute
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
        }
        int sum=0;
        for(int num:weights){
            sum+=num;
        }
        for(int capacity=max;capacity<=sum;capacity++){
            int daysReq=funDaysreq(weights,capacity);
            if(daysReq<=days){
                return capacity;
            }
        }
        return 0;
    }
    public static int funDaysreq(int weights[],int capacity){
        int days=1,loadcap=0;
        for(int i=0;i<weights.length;i++){
            if(loadcap+weights[i]>capacity){
                days=days+1;
                loadcap=weights[i];
            }
            else{
                loadcap+=weights[i];
            }
        }
        return days;
    }
}

//optimal
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
        }
        int sum=0;
        for(int num:weights){
            sum+=num;
        }
        int low=max,high=sum;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int daysReq=funDaysreq(weights,mid);
            if(daysReq<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return ans;
    }
    public static int funDaysreq(int weights[],int capacity){
        int days=1,loadcap=0;
        for(int i=0;i<weights.length;i++){
            if(loadcap+weights[i]>capacity){
                days=days+1;
                loadcap=weights[i];
            }
            else{
                loadcap+=weights[i];
            }
        }
        return days;
    }
}
