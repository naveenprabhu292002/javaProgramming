package refxy;
import java.util.*;
public class trying2 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for( int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int count_odd=0,count_even=0;
		for(int i=0;i<n;i++)
		{
            if(arr[i]%2!=0)
            {
            	count_odd++;
            }
            else
            {
               count_even++;
            }
        }
		System.out.println("ODD:" + count_odd);
		System.out.println("EVEN:" + count_even);
        System.out.println();

		int sum_odd=0,sum_even=0;
		for(int i=0;i<n;i++)
		{
            if(arr[i]%2!=0)
            {
            	sum_odd=sum_odd+arr[i];
            }
            else
            {
              sum_even=sum_even+arr[i];

            }
        }
		System.out.println(" Sum of ODD Numbers:" + sum_odd);
        System.out.println(" Sum of EVEN numbers:" + sum_even);
        System.out.println();
    	
        for(int i=1;i<=n;i++)
		{
            if(i%2!=0)
            {
            	System.out.println("ODD:" + i);
            }
            else
            {
            	System.out.println("Even:" + i);
            }
		
	   }

    }
}


