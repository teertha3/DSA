import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int num=n;
	    int i=2;
	    while(i<=n){
	        if(num%i==0 && isPrime(i)){
	            System.out.print(i+" ");
	            num=num/i;
	        }
	        else{
	            i++;
	        }
	    }
	}
	public static Boolean isPrime(int num){
	    if(num==2){
	        return true;
	    }
	    for(int i=3;i<=Math.sqrt(num);i++){
	        if(num%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
