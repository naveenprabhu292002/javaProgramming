package refxy;
import java.util.Scanner;
public class countb1 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       int count=0;
	       for(int i=1;i<n;i++)
	       {
	    	   arr[i]=sc.nextInt();
	       }
	       for(int i=0;i<n;i++)
			 {
				 int r=(int) Math.sqrt(arr[i]);
				 if(r*r==arr[i])
				 {
					 count++;
				 }
			 }
			 int ans=count;
			 System.out.print(ans);
		 }
		}

