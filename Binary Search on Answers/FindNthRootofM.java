//Brute
class Solution {
    public int NthRoot(int N, int M) {
        for(int i=1;i<=M;i++){
            if(pow(i,N)==M){
                return i;
            }
            else if(pow(i,N)>M){
                break;
            }
        }
        return -1;
        
    }
    public static int pow(int base,int exponent){
        int ans=1;
        for(int i=1;i<=exponent;i++){
            ans*=base;
        }
        return ans;
    }
}
//Optimal
class Solution {
    public int NthRoot(int N, int M) {
        int low=1;
        int high=M;
        while(low<=high){
            int mid=(low+high)/2;
            if(pow(mid,N)==M){
                return mid;
            }
            else if(pow(mid,N)>M){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
        
    }
    public static int pow(int base,int exponent){
        int ans=1;
        for(int i=1;i<=exponent;i++){
            ans*=base;
        }
        return ans;
    }
}
