//Brute
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:bloomDay){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        for(int i=min;i<=max;i++){
            if(bloomPossible(bloomDay,i,m,k)){
                return i;
            }
        }
        return -1;
    }
    public static boolean bloomPossible(int[] bloomDay,int day,int m,int k){
        int c=0,noOfBouq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                c++;
            }
            else{
                noOfBouq+=c/k;
                c=0;
            }
        }
        noOfBouq+=c/k;
        if(noOfBouq>=m){
            return true;
        }
        return false;
    }
}

//Using BS
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:bloomDay){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int low=min,high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(bloomPossible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean bloomPossible(int[] bloomDay,int day,int m,int k){
        int c=0,noOfBouq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                c++;
            }
            else{
                noOfBouq+=c/k;
                c=0;
            }
        }
        noOfBouq+=c/k;
        if(noOfBouq>=m){
            return true;
        }
        return false;
    }
}
