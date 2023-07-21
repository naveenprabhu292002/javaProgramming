package work;
import java.util.*;


public class arrayofDistinctInteger1 {
	 public static int triplets(int[] arr, int n)
	    {
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                for (int k = j + 1; k < n; k++) {
	                    if (arr[i] + arr[j] == arr[k]) {
	                        count++;
	                    }
	                    else if (arr[i] + arr[k] == arr[j]) {
	                        count++;
	                    }
	                    else if (arr[j] + arr[k] == arr[i]) {
	                        count++;
	                    }
	                }
	            }
	        }
	        return count;
	    }
	 
	    public static void main(String[] args)
	    {
	    	Scanner obj=new Scanner(System.in);
	    	int n=obj.nextInt();
	    	int[] arr = new int[n];
	    	for(int i=0;i<n;i++)
	    	{
	    		 arr[i] = obj.nextInt();
	    	}
	 
	        System.out.println(triplets(arr, n));
	    }
	}



