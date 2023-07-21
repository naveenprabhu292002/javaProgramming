package work;

import java.util.*;
public class on12thtestDnow {

	    public static void main(String[] args) 
	    {
	        Scanner obj=new Scanner(System.in);
	        int i,sum1=0,sum2=0;
	        int n=obj.nextInt();
	        int m=obj.nextInt();
	       
	        for(i=1;i<=m;i++)
	        {
	            if(i%n!=0)
	            {
	                sum1+=i;
	            }
	            else 
	            {
	                sum2+=i;
	            }
	        }
	        
	        
	        System.out.println(sum1-sum2);
	    }
	}