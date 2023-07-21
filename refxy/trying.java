package refxy;
import java.util.*;
public class trying{

public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	int arr[]=new int[n];
	
	for( int i=0;i<n;i++)
	{
		arr[i]=obj.nextInt();
	}
	int countodd=0,counteven=0;
	for(int i=0;i<n;i++)
	{
        if(arr[i]%2!=0)
        {
        	countodd++;
        }
        else
        {
           counteven++;
        }
    }
	System.out.println("ODD:" + countodd);
	System.out.println("EVEN:" + counteven);
	
	int sumodd=0,sumeven=0;
	for(int i=0;i<n;i++)
	{
        if(arr[i]%2!=0)
        {
        	sumodd=sumodd+arr[i];
        }
        else
        {
          sumeven=sumeven+arr[i];

        }
    }
	System.out.println("Sum of ODD Numbers:" + sumodd);
    System.out.println("Sum of EVEN numbers:" + sumeven);
	
	
	
}

}