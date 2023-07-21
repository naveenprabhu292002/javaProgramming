package refxy;
import java.util.*;

public class b1 {
	
	
	    public static void main(String args[])
	    {
	    int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	    int k=3/2;
	    int n=a[k][k];
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            if(i-j==1||i-j==-1)
	            {
	                System.out.print("s"+" ");
	            }
	            else if(a[i][j]==n)
	            {
	                System.out.print(n+" ");
	            }
	            else
	            {
	                System.out.print(a[i][j]=a[i][j]+n);
	                System.out.print(" ");
	            }
	    
	        }
	        System.out.println();
	        
	    }
	    }
}
	    
	
	