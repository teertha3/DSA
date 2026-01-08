class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        int n=arr.length;
        ArrayList<Integer>prefixSum=new ArrayList<>();
        prefixSum.add(arr[0]);
        for(int i=1;i<n;i++){
            prefixSum.add(prefixSum.get(i-1)+arr[i]);
        }
        return prefixSum;
        
    }
}
