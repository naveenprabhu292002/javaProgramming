package refxy;
import java.util.*;

public class squarearrayb2 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		  int n=obj.nextInt();
	        int[] arr=new int[n];
	        int temp=0;
	        for (int i=1;i<n;i++)
	        {
	            arr[i]=obj.nextInt();
	        }

	    
	        for (int i=0;i<n;i++) 
	        {
	            int s=(int) Math.sqrt(arr[i]);
	            if (s*s==arr[i])
	            {
	                temp++;
	            }
	        }
	       int value=temp+1;
	        	
	        System.out.println(value);
	    }
	}



