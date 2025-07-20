import java.util.*;
public class MinAndMax
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int max_element=Integer.MIN_VALUE;
		int min_element=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    max_element=Math.max(max_element,a[i]);
		    min_element=Math.min(min_element,a[i]);
		    
		}
		System.out.println("Max element:"+max_element);
		System.out.println("Min element:"+min_element);
	
	}
}
