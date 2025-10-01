//Brute Force
class Solution {
    public int rowWithMax1s(int[][] mat) {
       int index=-1,maxcnt=-1;
       for(int i=0;i<mat.length;i++){
            int cntrow=0;
            for(int j=0;j<mat[0].length;j++){
                cntrow+=mat[i][j];
            }
            if(cntrow>maxcnt && cntrow>0){
                maxcnt=cntrow;
                index=i;
            }
       }
       return index;
    }
}

//Optimal
public int rowWithMax1s(int[][] mat) {
        int maxcnt=0,index=-1;
        for(int i=0;i<mat.length;i++){
            int idx=lowerBound(mat[i],1);
            int cntrow;
            if(idx==-1){
                cntrow=0;
            }
            else{
                cntrow=mat[i].length-idx;
            }
            if(cntrow>maxcnt){
                maxcnt=cntrow;
                index=i;
            }
        }
        return index;
       
    }
    public static int lowerBound(int[] arr,int x){
        int low=0,high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
