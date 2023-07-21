package work;
import java.util.*;

public class rearrangeunsorted1 {
	    public static void rearrange(int arr[], int n)
	    {
	         int maxidx = n - 1, minidx = 0;
	   int maxelem = arr[n - 1] + 1;
	        for (int i = 0; i < n; i++) {
	            if (i % 2 == 0) {
	                arr[i] += (arr[maxidx] % maxelem) * maxelem;
	                maxidx--;
	            }
	            else {
	                arr[i] += (arr[minidx] % maxelem) * maxelem;
	                minidx++;
	            }
	        }
	        for (int i = 0; i < n; i++)
	            arr[i] = arr[i] / maxelem;
	        }
	    public static void main(String args[])
	    {
	    	Scanner obj=new Scanner(System.in);
	    	int n=obj.nextInt();
	    	int[] arr = new int[n];
	    	for(int i=0;i<n;i++)
	    	{
	    		arr[i]=obj.nextInt();
	    	}
	    rearrange(arr, n);
	     for (int i = 0; i < n; i++)
	     {
	     System.out.print(arr[i] + " ");
	    }
	}
}


