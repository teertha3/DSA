class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low=0,high=mat[0].length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=maxEle(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(mat[row][mid]>right && mat[row][mid]>left){
                return new int[] {row,mid};
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    public static int maxEle(int[][] mat,int mid){
        int rowindx=0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>mat[rowindx][mid]){
                rowindx=i;
            }
        }
        return rowindx;
    }
}
