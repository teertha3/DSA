class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int res[]=new int[n1];
        int subres[]=new int[n2];
        Stack<Integer>st=new Stack<>();
        for(int i=n2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                subres[i]=-1;
            }
            else{
                subres[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    res[i]=subres[j];
                    break;
                }
            }
        }
        return res;
        
    }
}
