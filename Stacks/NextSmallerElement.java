//Brute force
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++ ){
            int n=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    n=arr[j];
                    break;
                }
            }
            res.add(n);
        }
        return res;
    }
}

// Optimal approach using a stack

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer>res=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=st.peek()){
                    st.pop();
            }
            if(st.isEmpty()){
                res.add(-1);
                st.push(arr[i]);
            }
            else{
                res.add(st.peek());
            }
                st.push(arr[i]);
        }
        
        Collections.reverse(res);
        return res;
    }
}
