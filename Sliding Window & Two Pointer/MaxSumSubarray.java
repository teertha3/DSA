//Brute force
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        if(n<k){
            return -1;
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int currSum=0;
            for(int j=i;j<i+k;j++){
                currSum+=arr[j];
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
//Optimal- using Sliding Window
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n=arr.length;
        if(n<k){
            return -1;
        }
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
