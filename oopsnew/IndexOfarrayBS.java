package oopsnew;
import java.util.Arrays;
public class IndexOfarrayBS {
	
	  
	
	  
	    // Function to find the index of an element
	    public static int findIndex(int arr[], int t)
	    {
	  
	        int index = Arrays.binarySearch(arr, t);
	        return (index < 0) ? -1 : index;
	    }
	    // Driver Code
	    public static void main(String[] args)
	    {
	        int[] my_array = { 1, 2, 3, 4, 5, 6, 7 };
	  
	        // find the index of 5
	        System.out.println("Index position of 5 is: "
	                           + findIndex(my_array, 5));
	  
	        // find the index of 7
	        System.out.println("Index position of 7 is: "
	                           + findIndex(my_array, 7));
	    }
	}
