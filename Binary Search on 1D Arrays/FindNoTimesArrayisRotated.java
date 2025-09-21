class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int low=0;
        int high=nums.size()-1;
        int ans=Integer.MAX_VALUE;
        int ind=-1;
        while(low<=high){
            int mid=(low+high)/2;
            //when array is already sorted
            if(nums.get(low)<=nums.get(high)){
                return low;
            }
            //if left is sorted
            if(nums.get(low)<=nums.get(mid)){
                if(nums.get(low)<ans){
                    ans=nums.get(low);
                    ind=low;
                }
                low=mid+1; //eliminate left part now

            }
            //if right is sorted
            else{
                if(nums.get(mid)<ans){
                    ans=nums.get(mid);
                    ind=mid;
                }
                high=mid-1; //eliminate right part now
            }
        }
        return ind;

    }
}
