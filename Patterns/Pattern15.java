/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:
ABCDE
ABCD
ABC
AB
A
*/
class Solution {
    public void pattern15(int n){

        for(int i=n;i>=1;i--){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c=(char)(c+1);
            }
            System.out.println();
        }
    }
}
