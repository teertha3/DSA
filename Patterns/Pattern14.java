/*Let's say for N = 5, the pattern should look like as below:
A
AB
ABC
ABCD
ABCDE
*/
class Solution {
    public void pattern14(int n){

        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c=(char)(c+1);
            }
            System.out.println();
        }
    }
}
