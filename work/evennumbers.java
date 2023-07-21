package work;
import java.util.*;

public class evennumbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		System.out.println("Even numbers in the range 1 - " + n + " are: ");
		for(int i = 2; i <= n; i=i+2) 
		
			System.out.print(i + " ");
		sc.close();
	}
}
	


