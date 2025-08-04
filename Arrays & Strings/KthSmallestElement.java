// User function Template for Java 
//GFG

//Brute force approach
import java.util.*;
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(i==k-1){
                res=arr[i];
                break;
            }
        }
        return res;
    }
}
