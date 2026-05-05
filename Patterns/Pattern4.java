/* Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:
1
22
333
4444
55555
*/
class Solution {
    public void pattern4(int n) {
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}
