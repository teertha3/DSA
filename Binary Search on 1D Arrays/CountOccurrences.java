class Solution {
    public int countOccurrences(int[] arr, int target) {
        int c=0;
        int low=0;
        int high=arr.length-1;
        int firstPos=firstPosition(arr,low,high,target);
        int lastPos=lastPosition(arr,low,high,target);
        return (lastPos-firstPos+1);
    }
     public static int firstPosition(int[] arr,int low,int high,int target){
        int ans=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if (arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int lastPosition(int[] arr,int low,int high,int target){
        int ans=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
