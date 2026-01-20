class Solution {
    static boolean armstrongNumber(int n){
        int temp=n; 
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,3);
            temp/=10;
        }
        if(n==sum){
            return true;
        }
        return false;
        
    }
}
