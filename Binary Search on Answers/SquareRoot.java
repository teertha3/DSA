//Finding floor of sqrt of n

//Brute 
class Solution {
    public long floorSqrt(long n) {
      long ans=1;
      for(long i=1;i<=n;i++){
        if(i*i<=n){
            ans=i;
        }
        else{
            break;
        }
      }
      return ans;

    }
}

//Optimal
class Solution {
    public long floorSqrt(long n) {
      long ans=1;
      long low=1,high=n;
      while(low<=high){
        long mid=(low+high)/2;
        if((mid*mid)<=n){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return ans;
    }
}
