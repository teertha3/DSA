/* You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
12345
1234
123
12
1
  */
class Solution {
    public void pattern6(int n) {
        for(int i=n;i>=1;i--){
            int c=1;
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
