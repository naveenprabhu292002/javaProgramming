package refxy;
import java.util.*;
public class quess3 {
	 public static void main(String[]args) {
	        Scanner sc = new Scanner (System.in);
	        int t = sc.nextInt ();
	        int e[] = new int[t];
	        int l[] = new int[t];
	        for (int i = 0; i < t; i++)
	        e[i] = sc.nextInt ();
	        for (int i = 0; i < t; i++)
	        l[i] = sc.nextInt ();
	        int m = 0, sum = 0;
	        for (int i = 0; i < t; i++)
	        {
	            sum += e[i] - l[i];
	           m = Math.max (sum, m);
	        }
	       System.out.println(m);
	 }
}

