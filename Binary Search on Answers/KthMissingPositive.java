//Brute
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}
//optimal
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            missing[i]=arr[i]-(i+1);
        }
        int low=0,high=missing.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(missing[mid]>=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        //if ans is beyond last ele
        int n=arr.length;
        if(high==n-1){
            return arr[high]+(k-missing[n-1]);
        }
        //if kth missing is before arr[0]
        if(high==-1){
            return k;
        }
        //now arr[high] and arr[low] points to range where the missing number is
        int c=k-missing[high]; //more k-missing[high] numbers is needed
        return arr[high]+c; //arr[high]+more
       
    }
}
