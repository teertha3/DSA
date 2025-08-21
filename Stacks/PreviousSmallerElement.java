class Solution {
    public int[] leftSmaller(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
}
