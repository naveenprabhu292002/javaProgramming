package study;
import java.util.Scanner;

public class MinOfOperationStr {
	public static void main(String [] args) {
	Scanner obj=new Scanner (System.in);
	
	String s1=obj.nextLine();
	String s2=obj.nextLine();
	StringBuilder str=new StringBuilder(s1);
	StringBuilder str1=new StringBuilder(s2);
	char arr[]=s1.toCharArray();
	char arr2[]=s2.toCharArray();
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr2.length;j++)
		{
			if(arr[i]==arr2[j]) {
				i++;
			}
			else {
				count++;
				
			}
		}
	}
	System.out.println(count);
}

		
	}
	
	


