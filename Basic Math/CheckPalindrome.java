class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,rev=0;
        while(temp>0){
            int ld=temp%10;
            rev=(rev*10)+ld;
            temp/=10;
        }
        if(rev==x){
            return true;
        }
    return false;
        
    }
}
