//brute force
class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        int n=nums.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int c=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                    visited[j]=true;
                }
            }
            res.add(Arrays.asList(nums[i],c));
        }
        return res;
    }
}

