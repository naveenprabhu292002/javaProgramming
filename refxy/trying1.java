package refxy;
import java.util.*;

public class trying1 {
	public static  void main(String args[])
	{
		Scanner obj=new Scanner (System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int counteven=0;
		int countodd=0;
		for(int i=0;i<n;i++)
		{
			 if ((arr[i] % 2) == 1)
				 countodd++;
			 else
				 counteven++;
		}
	  System.out.println("odd: "+countodd);
	  System.out.println("eve: "+counteven);
				 	}
	}
	


