//Brute force
class Solution {
    public int countPrimes(int n) {
      int c=0;
      for(int i=0;i<n;i++){
        if(isPrime(i)){
            c++;
        }
      }
      return c;
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

//Optimal: Sieve of Eratosthenes algorithm
class Solution {
    public int countPrimes(int n) {
     if(n<2){
        return 0;
     }
     boolean isPrime[]=new boolean[n];
     Arrays.fill(isPrime,true);
     isPrime[0]=false;
     isPrime[1]=false;
     for(int i=2;i<Math.sqrt(n);i++){
        if(isPrime[i]){
            for(int j=i*i;j<n;j+=i){
                isPrime[j]=false;
            }
        }
     }
     int c=0;
     for(boolean x:isPrime){
        if(x){
            c++;
        }
     }
     return c;
}
}
