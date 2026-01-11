class Solution {
    public long solve(int[] bt) {
        Arrays.sort(bt);
        int n=bt.length;
        int wt=0,t=0;
        for(int i=0;i<n;i++){
            wt+=t;
            t+=bt[i];
        }
        return wt/n;
    }
}
