package work;
import java.util.*;

public class array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int flag =0;
		int i =0;
		
		
		for( i = 0; i < n; i++) {
			 arr[i]=sc.nextInt();
			System.out.print(arr[i] );
		}
		System.out.println(" \nsearch index:");
		int search =sc.nextInt();
		for( i = 0; i < n; i++) {
			//System.out.println(" \nsearch index:");
			if(search==arr[i]) {
				flag++;
			}

}
		if(flag==1) {
			System.out.println(arr[i]);
		}
		else {
			System.out.println("not found");
			
			
		}
		}
		}
		
			
		
			
		
		
		
		
		
	




