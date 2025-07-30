import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a1[]={23,12,789,8,5,4};
		int a2[]={23,12,789,2};
		HashSet<Integer>hs=new HashSet<>();
		int sum=0;
		for(int num:a1){
		    if(!hs.contains(num)){
		        hs.add(num);
		        sum+=num;
		    }
		}
		for(int num:a2){
		    if(hs.contains(num)){
		        sum-=num;
		    }
		    else{
		        hs.add(num);
		        sum+=num;
		    }
		}
    	while (sum>=10) {
            int temp=0;
            while (sum>0) {
                temp+=sum%10;
                sum/=10;
            }
            sum=temp;
        }
		System.out.println(sum);
	}
}
