class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hs.contains(target-arr[i])){
                return true;
            }
            else{
                hs.add(arr[i]);
            }
        }
        return false;
    }
}
